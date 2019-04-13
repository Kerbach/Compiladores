grammar Sauro;

/*
COMANDOS TERMINAL

        C:
        cd C:\Users\wrkerber\Documents\NetBeansProjects\Compiladores\Compiladores\src\compilador
        1_build.bat
        2_compile.bat teste.dino

        

*/

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
    //import java.util.ArrayList;
}

@parser::members
{
    private static int stack_cur, stack_max, if_counter;

    public static void emit (String bytecode, int delta)
    {
        System.out.println("    " + bytecode);
        stack_cur += delta;
        if(stack_cur > stack_max)
        {
            stack_max = stack_cur;
        }
    }

    private static ArrayList<String> symbol_table;

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        SauroLexer lexer = new SauroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SauroParser parser = new SauroParser(tokens);

        // Tabela de Símbolos
        symbol_table = new ArrayList<String>();
        symbol_table.add("args");
        parser.program();
        System.out.println("; symbols: " + symbol_table);
    }
}

/*---------------- LEXER RULES ----------------*/

IF          : 'if' ;
OP_CUR      : '{' ;
CL_CUR      : '}' ;
EQ          : '==' ;
NE          : '!=' ;
GT          : '>' ;
GE          : '>=' ;
LT          : '<' ;
LE          : '<=' ; 

PLUS        : '+' ;
MINUS       : '-' ;
TIMES       : '*' ;
OVER        : '/' ;
REMAINDER   : '%' ;
OP_PAR      : '(' ;
CL_PAR      : ')' ;
ATTRIB      : '=' ;
COMMA       : ',' ;

PRINT       : 'print' ;
READ_INT    : 'read_int' ;

NUMBER      : '0'..'9'+ ;
VAR         : 'a'..'z'+ ;

SPACE       : (' '|'\t'|'\r'|'\n')+ { skip(); } ;

COMMENT     : '#' ~[\r\n]* { skip();} ;

/*---------------- PARSER RULES ----------------*/

program
    :
        {
            System.out.println(".source Test.j");
            System.out.println(".class  public Test");
            System.out.println(".super  java/lang/Object");
            System.out.println("\n.method public <init>()V");
            System.out.println("    aload_0");
            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
            System.out.println("    return");
            System.out.println(".end method");
        }
       main
    ;

main
    :   {
            System.out.println("\n.method public static main([Ljava/lang/String;)V");
        }
        (statement)+
        {
            System.out.println("        return");
            System.out.println(".limit locals " + symbol_table.size());
            System.out.println(".limit stack " + stack_max);
            System.out.println(".end method");
        }
    ;

statement
    : st_print | st_attrib | st_if
    ;

st_print            // PRINT OP_PAR expression (COMMA expression )* CL_PAR
    :   PRINT OP_PAR
            { 
                emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
        expression
            { 
                emit("    invokevirtual java/io/PrintStream/print(I)V", - 2); 
            }
        (COMMA
            {
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
                emit("    ldc \" \" ", + 1); 
                emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 1); 

                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
        expression 
            { 
                emit("    invokevirtual java/io/PrintStream/print(I)V", - 2); 
            } 
        )* CL_PAR
            { 
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
                emit("    invokevirtual java/io/PrintStream/println()V", - 1);	    
            }
    ;

st_attrib
    :   VAR ATTRIB expression
            {
                if (!symbol_table.contains($VAR.text))
                {
                    symbol_table.add($VAR.text);
                }
                int address = symbol_table.indexOf($VAR.text);

                emit("    istore " + address + "\n", - 1);
            }
    ;

st_if
    :   {int if_local = ++if_counter;}
        IF comparison OP_CUR (statement)+ CL_CUR
            { 
                System.out.println("        NOT_IF_" + if_local + ":"); 
            }
    ;

comparison
    :   expression op = ( EQ | NE | GT | GE | LT | LE) expression
        {
            if($op.type == EQ) { emit("\n        if_icmpne NOT_IF_" + if_counter,-2); }
            if($op.type == NE) { emit("\n        if_icmpeq NOT_IF_" + if_counter,-2); }
            if($op.type == LT) { emit("\n        if_icmpge NOT_IF_" + if_counter,-2); }
            if($op.type == LE) { emit("\n        if_icmpgt NOT_IF_" + if_counter,-2); }
            if($op.type == GT) { emit("\n        if_icmple NOT_IF_" + if_counter,-2); }
            if($op.type == GE) { emit("\n        if_icmplt NOT_IF_" + if_counter,-2); }
        }
    ;

expression
    :   term ( op = ( PLUS | MINUS ) term 
            {
                emit(($op.type == PLUS) ? "iadd" : "    isub", - 1);
            } 
        )*
    ;

term
    :   factor ( op = ( TIMES | OVER | REMAINDER ) factor 
            { 
                if      ($op.type == TIMES) {emit("    imul", - 1);}    
                else if ($op.type == OVER)  {emit("    idiv", - 1);}    
                else                        {emit("    irem", - 1);}    
            }
         )*
    ;

factor              // NUMBER  |   OP_PAR expression CL_PAR |   VAR |   READ_INT OP_PAR CL_PAR
    :   NUMBER
            { 
                emit("    ldc "+ $NUMBER.text, + 1); 
            }
    |   OP_PAR expression CL_PAR
    |   VAR
            {
                if(!symbol_table.contains($VAR.text))
                { 
                    System.err.println("Variable " + $VAR.text + " not declared.\n"); 
                    System.exit(1);
                }
                if(symbol_table.contains($VAR.text))
                {
                    emit("    iload " + symbol_table.indexOf($VAR.text), + 1);
                }
                else
                {
                    emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                }
            }
    |   READ_INT OP_PAR CL_PAR
            {
                emit("    invokestatic Runtime/readInt()I", +1);
            }
        
    ;

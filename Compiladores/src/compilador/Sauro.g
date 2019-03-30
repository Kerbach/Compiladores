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
    private static int stack_cur, stack_max;

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

PLUS        : '+' ;
MINUS       : '-' ;
TIMES       : '*' ;
OVER        : '/' ;
REMAINDER   : '%' ;
OP_PAR      : '(' ;
CL_PAR      : ')' ;
ATTRIB       : '=';

PRINT       : 'print' ;

NUMBER      : '0'..'9'+ ;
VAR         : 'a'..'z'+ ;

SPACE : (' '|'\t'|'\r'|'\n')+ { skip(); } ;

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
            System.out.println("    return");
            System.out.println(".limit locals " + symbol_table.size());
            System.out.println(".limit stack " + stack_max);
            System.out.println(".end method");
        }
    ;

statement
    : st_print | st_attrib
    ;

st_print
    :   {emit("\n    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);}
        PRINT OP_PAR expression CL_PAR   
        {emit("\n    invokevirtual java/io/PrintStream/println(I)V\n", - 2);}
    ;
st_attrib
    :
        VAR ATTRIB expression
        {
            if (!symbol_table.contains($VAR.text))
            {
                symbol_table.add($VAR.text);
            }
            int address = symbol_table.indexOf($VAR.text);
            
            emit("    istore " + address + "\n", - 1);
        }
    ;

expression
    :   term ( op = ( PLUS | MINUS ) term 
            {emit(($op.type == PLUS) ? "iadd" : "    isub", - 1);} 
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

factor
    :   NUMBER
            { emit("    ldc "+ $NUMBER.text, + 1); }
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
    ;

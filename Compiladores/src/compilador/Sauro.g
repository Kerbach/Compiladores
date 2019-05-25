grammar Sauro;

/*
COMANDOS TERMINAL

        C:
        cd C:\Users\wrkerber\Documents\NetBeansProjects\Compiladores\Compiladores\src\compilador
        1_build.bat
        2_compile.bat teste.dino

        "C:\Program Files\Java\jdk1.8.0_191\bin\javac.exe" -cp antlr-4.7.2.jar DenterHelper.java

        "C:\Program Files\Java\jdk1.7.0_80\bin\javac.exe" List.java

*/

/*---------------- LEXER INTERNALS ----------------*/

@lexer::members
{
    private DenterHelper denter = new DenterHelper(NL, SauroParser.INDENT,
                                                   SauroParser.DEDENT) {
        @Override
        public Token pullToken() {
            return SauroLexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}


/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
    //import java.util.ArrayList;
}

@parser::members
{
    private static int stack_cur, stack_max, if_counter;
    private static int if_count = 0;
    private static int while_count = 0;
    
    private static boolean has_error = false;

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
    private static ArrayList<Character> type_table;

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        SauroLexer lexer = new SauroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SauroParser parser = new SauroParser(tokens);

        has_error = false;

        // Tabela de Símbolos
        symbol_table = new ArrayList<String>();
        type_table = new ArrayList<Character>();

        symbol_table.add("args");
        type_table.add('-');
        
        parser.program();
        System.out.println("; symbols: " + symbol_table);

        if(has_error == true)
		{
            System.err.println("Existem erros que precisam ser corrigidos!");
            System.exit(1);
		}
    }
}

/*---------------- LEXER RULES ----------------*/

tokens {INDENT, DEDENT}

IF          : 'if' ;
WHILE       : 'while' ;
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
COLON       : ':' ;

PRINT       : 'print' ;
READ_INT    : 'read_int' ;
READ_STR    : 'read_str' ;

APPEND      : 'append' ;
LIST        : 'list' ;
OP_BRA      : '[' ;
CL_BRA      : ']' ;
DOT         : '.' ;
LEN         : 'len' ;
STR         : 'str' ;

NUMBER      : '0'..'9'+ ;
VAR         : 'a'..'z'+ ;
STRING      : '"' ~["]* '"' ;

COMMENT     : '#' ~[\r\n]* { skip();} ;
NL: ('\r'? '\n' ' '*) ;
SPACE       : (' '|'\t')+ { skip(); } ;

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
    : st_print | st_attrib | st_if | st_while| st_new_list | st_list_append | st_list_attrib | NL
    ;

st_print
    :   PRINT OP_PAR
            { 
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
            e1 = expression
            {
                if ($e1.type == 'i') 
                {
                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
                } 
                else 
                {
                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
                }
            }
        (COMMA
            { 
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
        e2 = expression
            {
                if ($e2.type == 'i') 
                {
                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
                } 
                else 
                {
                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
                }
            }
        )* CL_PAR
        {
            emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
            emit("    invokevirtual java/io/PrintStream/println()V", - 1);
        }
    ;

st_new_list
        // variable = list()
    :   VAR
        {
            symbol_table.add($VAR.text);
            int address = symbol_table.indexOf($VAR.text);
        }
        ATTRIB LIST OP_PAR CL_PAR
        {
            emit("    new List", + 1);
            emit("    dup", + 1);
            emit("    invokespecial List/<init>()V", - 1);
            emit("    astore " + address + "\n", - 1);
        }
    ;

st_list_append
        // variable . append ( expression )
    :   VAR
        {
            int address = symbol_table.indexOf($VAR.text);
            emit("    aload " + address, + 1);
        } 
        DOT APPEND OP_PAR e = expression CL_PAR
        {
            emit("    invokevirtual List/append(I)V", - 2);
        }
    ;

st_list_attrib
        // variable [ expression ] = expression
    :   VAR 
            {
                int address = symbol_table.indexOf($VAR.text);
                emit("    aload " + address + "\n", + 1);
            }
        OP_BRA e1 = expression 
            {
                if ($e1.type != 'i') 
                {
                    System.err.println("# error: list index must be integer");
                    //System.exit(1);
                }
            }
        CL_BRA ATTRIB e2 = expression
            {
                if ($e1.type != 'i') 
                {
                    System.err.println("# error: list index must be integer");
                    //System.exit(1);
                }
                emit("    invokevirtual List/set(II)V", - 3);
            }
    ;

st_attrib
    :   
        VAR ATTRIB e = expression
        {
            if (!symbol_table.contains($VAR.text))
            {
                symbol_table.add($VAR.text);
                type_table.add($e.type);
                if($e.type == 'i')
                {
                    type_table.add('i');
                }
                else
                {
                    type_table.add('a');
                }
            }
            else 
            {
                System.err.println("# error: '" + $VAR.text + "' is already declared");
            }

            int address = symbol_table.indexOf($VAR.text);
            
            if ($e.type == 'i')
            {
                if(type_table.get(address) == 'i')
                {
                    emit("    istore " + address + "\n", - 1);
                }
                else
                {
                    System.err.println("A variável " + $VAR.text + " está com o tipo incorreto! [Linha " + $VAR.line + "]");
                    has_error = true;
                }
            }
            else
            {
                if(type_table.get(address) == 'a')
                {
                    emit("    astore " + address + "\n", - 1);
                }
                else
                {
                    System.err.println("A variável " + $VAR.text + " está com o tipo incorreto! [Linha " + $VAR.line + "]");
                    has_error=true;
                }
            }
        }
    ;

st_if
    :   {
            if_count++;
            int if_local = if_count;
        }
        IF 
        e1 = expression op = (EQ | NE | GT | GE | LT | LE) e2 = expression 
        {
            if($e1.type == 'i' && $e2.type == 'i')
            {
                if ($op.type == EQ) { emit("\nif_icmpne NOT_IF_" + if_count, -2); }
                else if ($op.type == NE) { emit("\nif_icmpeq NOT_IF_" + if_count, -2); }
                else if ($op.type == GT) { emit("\nif_icmple NOT_IF_" + if_count, -2); }
                else if ($op.type == GE) { emit("\nif_icmplt NOT_IF_" + if_count, -2); }
                else if ($op.type == LT) { emit("\nif_icmpge NOT_IF_" + if_count, -2); }
                else if ($op.type == LE) { emit("\nif_icmpgt NOT_IF_" + if_count, -2); }
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $e1.text + " and " + $e2.text + "! [Line " + $op.line + "]");
                has_error = true;
            }
        }
        COLON INDENT ( statement )+ DEDENT
        { System.out.println("NOT_IF_" + if_local + ":"); }
    ;

/*
comparison
    :   expression op = ( EQ | NE | GT | GE | LT | LE) expression
        {
            if ($op.type == EQ) { emit("\nif_icmpne NOT_IF_" + if_count, -2); }
            else if ($op.type == NE) { emit("\nif_icmpeq NOT_IF_" + if_count, -2); }
            else if ($op.type == GT) { emit("\nif_icmple NOT_IF_" + if_count, -2); }
            else if ($op.type == GE) { emit("\nif_icmplt NOT_IF_" + if_count, -2); }
            else if ($op.type == LT) { emit("\nif_icmpge NOT_IF_" + if_count, -2); }
            else if ($op.type == LE) { emit("\nif_icmpgt NOT_IF_" + if_count, -2); }
        }
    ;
 */

st_while
    :   {
            while_count++;
            int while_local = while_count;
            System.out.println("BEGIN_WHILE_" + while_local + ":"); 
        }
        WHILE 
        e1 = expression op = (EQ | NE | GT | GE | LT | LE) e2 = expression 
		{
			if($e1.type == 'i' && $e2.type == 'i')
			{
                     if ($op.type == EQ) { emit("\nif_icmpne END_WHILE_" + while_count, -2); }
                else if ($op.type == NE) { emit("\nif_icmpeq END_WHILE_" + while_count, -2); }
                else if ($op.type == GT) { emit("\nif_icmple END_WHILE_" + while_count, -2); }
                else if ($op.type == GE) { emit("\nif_icmplt END_WHILE_" + while_count, -2); }
                else if ($op.type == LT) { emit("\nif_icmpge END_WHILE_" + while_count, -2); }
                else if ($op.type == LE) { emit("\nif_icmpgt END_WHILE_" + while_count, -2); }		
			}
			else
			{
				System.err.println("# error: cannot mix types. -> " + $e1.text + " and " + $e2.text + "! [Line " + $op.line + "]");
				has_error = true;
			}
		}
        COLON INDENT ( statement )+ DEDENT
        {
            emit("    goto BEGIN_WHILE_" + while_local, 1);
            System.out.println("END_WHILE_" + while_local + ":");
        }
    ;

/*
comparison_while
    :   expression op = ( EQ | NE | GT | GE | LT | LE) expression
        {
                 if ($op.type == EQ) { emit("\nif_icmpne END_WHILE_" + while_count, -2); }
            else if ($op.type == NE) { emit("\nif_icmpeq END_WHILE_" + while_count, -2); }
            else if ($op.type == GT) { emit("\nif_icmple END_WHILE_" + while_count, -2); }
            else if ($op.type == GE) { emit("\nif_icmplt END_WHILE_" + while_count, -2); }
            else if ($op.type == LT) { emit("\nif_icmpge END_WHILE_" + while_count, -2); }
            else if ($op.type == LE) { emit("\nif_icmpgt END_WHILE_" + while_count, -2); }
        }
    ;
 */

expression returns [char type]
    :   t1 = term ( op = ( PLUS | MINUS ) t2 = term 
        {
            if($t1.type == 'i' && $t2.type == 'i')
            {
                if ($op.type == PLUS)
                { 
                    emit("iadd", - 1); 
                }
                else
                {
                    emit("isub", - 1);
                }
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $t1.text + " and " + $t2.text + "! [Line " + $op.line + "]");
                has_error = true;
            }
        } 
        )*
        {$type = $t1.type;}
    ;

term returns [char type]
    :   f1 = factor ( op = ( TIMES | OVER | REMAINDER ) f2 = factor 
        {
            if(($f1.type == 'i') && ($f2.type == 'i'))
            {
                if      ($op.type == TIMES) {emit("    imul", - 1);}    
                else if ($op.type == OVER)  {emit("    idiv", - 1);}    
                else                        {emit("    irem", - 1);}    
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $f1.text + " and " + $f2.text + "! [Line " + $op.line + "]");
                has_error = true;
            } 
        }
         )*
         {$type = $f1.type;}
    ;

factor returns [char type]             // NUMBER  |   OP_PAR expression CL_PAR |   VAR |   READ_INT OP_PAR CL_PAR
    :   NUMBER
            { 
                $type = 'i';
                emit("    ldc "+ $NUMBER.text, + 1); 
            }
    |   OP_PAR e = expression CL_PAR
            {
                $type = $e.type;
            }
    |   VAR
            {
                if (!symbol_table.contains($VAR.text)) 
                {
                    System.err.println("# error: '"+ $VAR.text +"' not defined");
                    //System.exit(1);
                } else 
                {
                    $type = 'i';
                    emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                }
            }
        OP_BRA e = expression CL_BRA
            {
                emit("    invokevirtual List/get(I)I", + 1);
            }
    |   VAR
            {
                if (!symbol_table.contains($VAR.text)) 
                {
                    System.err.println("# error: '"+ $VAR.text +"' not defined");
                    //System.exit(1);
                } 
                else 
                {
                    if (type_table.get(symbol_table.indexOf($VAR.text)) == 'i') 
                    {
                        emit("iload " + symbol_table.indexOf($VAR.text), + 1);
                    } 
                    else 
                    {
                        emit("aload " + symbol_table.indexOf($VAR.text), + 1);
                    }

                    $type = type_table.get(symbol_table.indexOf($VAR.text));
                }
            }
    |   READ_INT OP_PAR CL_PAR
            {
                $type = 'i';
                emit("    invokestatic Runtime/readInt()I", +1);
            }
    |   READ_STR OP_PAR CL_PAR
            {
                $type = 'a';
                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
            }
    |   STRING 
            {
                $type = 'a';
                emit("    ldc "+ $STRING.text, + 1); 
            }
        // LEN (variable)
    |   LEN OP_PAR VAR CL_PAR
            {
                $type = 'i';
                emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                emit("    invokevirtual List/len()I", 0);
            }
        // STR (variable)
    |   STR OP_PAR VAR CL_PAR
            {
                $type = 'a';
                emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                emit("    invokevirtual List/str()Ljava/lang/String;", 0);
            }
    ;

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
    //private static ArrayList<String> symbol_table;

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        SauroLexer lexer = new SauroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SauroParser parser = new SauroParser(tokens);

        //symbol_table = new ArrayList<String>();
        parser.program();
        //System.out.println("symbols: " + symbol_table);
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
            System.out.println(".limit locals 2");
            System.out.println(".limit stack 10");
            System.out.println(".end method");
        }
    ;

statement
    : st_print | st_attrib
    ;

st_print
    :   {System.out.println("\n    getstatic java/lang/System/out Ljava/io/PrintStream;");}
        PRINT OP_PAR expression CL_PAR   
        {System.out.println("\n    invokevirtual java/io/PrintStream/println(I)V\n");}
    ;
st_attrib
    :
        VAR ATTRIB expression
        {System.out.println("    istore 1\n");}
    ;

expression
    :   term ( op = ( PLUS | MINUS ) term 
            {System.out.println(($op.type == PLUS) ? "    iadd" : "    isub");} 
        )*
    ;

term
    :   factor ( op = ( TIMES | OVER | REMAINDER ) factor 
            { 
                if      ($op.type == TIMES) {System.out.println("    imul");}    
                else if ($op.type == OVER)  {System.out.println("    idiv");}    
                else                        {System.out.println("    irem");}    
            }
         )*
    ;

factor
    :   NUMBER
            { System.out.println("    ldc "+ $NUMBER.text); }
    |   OP_PAR expression CL_PAR
    |   VAR
            { System.out.println("    iload 1"); }
    ;

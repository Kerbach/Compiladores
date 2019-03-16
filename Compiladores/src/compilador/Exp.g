grammar Exp;

/*
java -jar .\antlr-4.7.2.jar Exp.g
C:"\Program Files\Java\jdk1.8.0_191\bin\javac.exe" -cp antlr-4.7.2.jar Exp*.java
C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" -cp "antlr-4.7.2.jar;." ExpParser


1 + 2 * 3
^Z

Resultado:
1
2
3


C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" -cp "antlr-4.7.2.jar;." ExpParser < input.txt > Test.j
C:"\Program Files\Java\jdk1.8.0_191\bin\java.exe" -jar jasmin-2.4.jar Test.j
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
        ExpLexer lexer = new ExpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);

        //symbol_table = new ArrayList<String>();
        parser.program();
        //System.out.println("symbols: " + symbol_table);
    }
}

/*---------------- LEXER RULES ----------------*/

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
OP_PAR: '(' ;
CL_PAR: ')' ;

NUMBER: '0'..'9'+ ;

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
            System.out.println("\n    getstatic java/lang/System/out Ljava/io/PrintStream; \n");
        }
        expression
        {
            System.out.println("\n    invokevirtual java/io/PrintStream/println(I)V");
            System.out.println("\n    return\n");
            System.out.println(".limit stack 10");
            System.out.println(".end method");   
        }
    ;

expression
    :   term ( op = ( PLUS | MINUS ) term 
            {System.out.println(($op.type == PLUS) ? "   iadd" : "   isub");} 
        )*
    ;

term
    :   factor ( op = ( TIMES | OVER | REMAINDER ) factor 
            { 
                if      ($op.type == TIMES) {System.out.println("   imul");}    
                else if ($op.type == OVER)  {System.out.println("   idiv");}    
                else                        {System.out.println("   irem");}    
            }
         )*
    ;

factor
    :   NUMBER
        { System.out.println("   ldc "+ $NUMBER.text); }
    |   OP_PAR expression CL_PAR
    ;

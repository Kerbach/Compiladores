package aula03_simple_machine;

import aula01.Token;
import java.util.ArrayList;

/* Implementa um analisador sintatico descendente recursivo para
 * expressoes aritmeticas
 */
public class Bytecode
{
    
    /*
    .source Test.j
    .class  public Test
    .super  java/lang/Object

    .method public <init>()V
        aload_0
        invokenonvirtual java/lang/Object/<init>()V
        return
    .end method

    .method public static main([Ljava/lang/String;)V

        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 1
        ldc 2
        iadd

        invokevirtual java/io/PrintStream/println(I)V

        return

    .limit stack 10
    .end method
    */

    private ArrayList<Token> tokens; // vetor de tokens da analise lexica

    public Bytecode(ArrayList<Token> tokens)
    {
        this.tokens = tokens;
    }

    public void run()
    {
        System.out.println(".source Test.j");
        System.out.println(".class  public Test");
        System.out.println(".super  java/lang/Object");
        System.out.println("\n.method public <init>()V");
        System.out.println("    aload_0");
        System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
        System.out.println("    return");
        System.out.println(".end method");
        System.out.println("\n.method public static main([Ljava/lang/String;)V");
        System.out.println("\n    getstatic java/lang/System/out Ljava/io/PrintStream; \n");
        
        this.tokens.add(new Token('$')); // token extra de fim da lista
        E();
        if (this.tokens.size() != 1)
        {
            System.err.println("Error: unprocessed tokens left");
            System.err.println("Remaining tokens: " + this.tokens);
        }
        else
        {
            //System.out.println("Expression correct!");
        }
        
        System.out.println("\n    invokevirtual java/io/PrintStream/println(I)V");
        System.out.println("\n    return\n");
        System.out.println(".limit stack 10");
        System.out.println(".end method");
    }

    // Metodo que implementa a regra E -> T | T ( (+|-) T ) *
    private void E()
    {
        T();
        while (this.tokens.get(0).getType() == '+' || this.tokens.get(0).getType() == '-')
        {
            Token t = this.tokens.remove(0);
            E();
            if (t.getType() == '+')
            {
                System.out.println("    iadd");
            }
            else
            {
                System.out.println("    isub");
            }
        }
    }

    // Metodo que implementa a regra T -> F ( (*|/) F )*
    private void T()
    {
        F();
        
        while (this.tokens.get(0).getType() == '/' || this.tokens.get(0).getType() == '*')
        {
            Token t = this.tokens.remove(0);
            F();
            if (t.getType() == '*')
            {
                System.out.println("    imul");
            }
            else
            {
                System.out.println("    idiv");
            }
        }
    }

    // Metodo que implementa a regra F -> n | ( E )
    private void F()
    {
        if (this.tokens.get(0).getType() == 'n')
        {
            // Imprime o valor na tela
            System.out.println("    ldc "+ (int) this.tokens.get(0).getValue());

            // remove do token
            this.tokens.remove(0);

        }
        else if (this.tokens.get(0).getType() == '(')
        {
            this.tokens.remove(0);
            E();
            if (this.tokens.get(0).getType() == ')')
            {
                this.tokens.remove(0);
            }
            else
            {
                System.err.println("Error: missing ')'");
                System.exit(1);
            }
        }
        else
        {
            System.err.println("Error: unexpected token");
            System.exit(1);
        }
    }
}

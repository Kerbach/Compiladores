package aula03_simple_machine;

import aula01.Token;
import java.util.ArrayList;

/* Implementa um analisador sintatico descendente recursivo para
 * expressoes aritmeticas
 */
public class Compiler
{

    private ArrayList<Token> tokens; // vetor de tokens da analise lexica

    public Compiler(ArrayList<Token> tokens)
    {
        this.tokens = tokens;
    }

    public void run()
    {
        this.tokens.add(new Token('$')); // token extra de fim da lista
        E();
        if (this.tokens.size() != 1)
        {
            System.err.println("Error: unprocessed tokens left");
            System.err.println("Remaining tokens: " + this.tokens);
        }
        else
        {
            System.out.println("Expression correct!");
        }
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
                System.out.println("ADD");
            }
            else
            {
                System.out.println("REM");
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
                System.out.println("MUL");
            }
            else
            {
                System.out.println("DIV");
            }
        }
    }

    // Metodo que implementa a regra F -> n | ( E )
    private void F()
    {
        if (this.tokens.get(0).getType() == 'n')
        {
            // Imprime o valor na tela
            System.out.println(this.tokens.get(0).getValue());

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

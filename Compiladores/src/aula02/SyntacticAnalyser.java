package aula02;

import aula01.Token;
import java.util.ArrayList;

/* Implementa um analisador sintatico descendente recursivo para
 * expressoes aritmeticas
 */
public class SyntacticAnalyser
{

    private ArrayList<Token> tokens; // vetor de tokens da analise lexica

    public SyntacticAnalyser(ArrayList<Token> tokens)
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
        } else
        {
            System.out.println("Expression correct!");
        }
    }

    // Metodo que implementa a regra E -> T | T + E
    private void E()
    {
        T();
        if (this.tokens.get(0).getType() == '+')
        {
            this.tokens.remove(0);
            E();
        }
    }

    // Metodo que implementa a regra T -> F | F * T
    private void T()
    {
        F();
        if (this.tokens.get(0).getType() == '*')
        {
            this.tokens.remove(0);
            T();
        }
    }

    // Metodo que implementa a regra F -> n | ( E )
    private void F()
    {
        if (this.tokens.get(0).getType() == 'n')
        {
            this.tokens.remove(0);
        } else if (this.tokens.get(0).getType() == '(')
        {
            this.tokens.remove(0);
            E();
            if (this.tokens.get(0).getType() == ')')
            {
                this.tokens.remove(0);
            } else
            {
                System.err.println("Error: missing ')'");
                System.exit(1);
            }
        } else
        {
            System.err.println("Error: unexpected token");
            System.exit(1);
        }
    }
}

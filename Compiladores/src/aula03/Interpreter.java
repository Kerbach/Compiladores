package aula03;

import aula02.*;
import aula01.Token;
import java.util.ArrayList;

/* Implementa um analisador sintatico descendente recursivo para
 * expressoes aritmeticas
 */
public class Interpreter
{

    private ArrayList<Token> tokens; // vetor de tokens da analise lexica

    public Interpreter(ArrayList<Token> tokens)
    {
        this.tokens = tokens;
    }

    public void run()
    {
        this.tokens.add(new Token('$')); // token extra de fim da lista
        System.out.println("Result: "+ E());
        
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

    // Metodo que implementa a regra E -> T | T + E
    private double E()
    {
        double v = T();
        if (this.tokens.get(0).getType() == '+')
        {
            this.tokens.remove(0);
            v += E();
        }
        return v;
    }

    // Metodo que implementa a regra T -> F | F * T
    private double T()
    {
        double v = F();
        if (this.tokens.get(0).getType() == '*')
        {
            this.tokens.remove(0);
            v *= T();
        }
        return v;
    }

    // Metodo que implementa a regra F -> n | ( E )
    private double F()
    {
        if (this.tokens.get(0).getType() == 'n')
        {
            return this.tokens.remove(0).getValue();
        }
        else if (this.tokens.get(0).getType() == '(')
        {
            this.tokens.remove(0);
            double v = E();
            if (this.tokens.get(0).getType() == ')')
            {
                this.tokens.remove(0);
                return v;
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
        
        return 0;
    }
}

package aula02;

import aula01.Token;
import java.util.ArrayList;

/* Implementa um analisador sintatico descendente recursivo para
 * expressoes aritmeticas
 */
public class SyntacticAnalyser
{

    private ArrayList<Token> tokens; // vetor de tokens resultante da analise lexica

    public SyntacticAnalyser(ArrayList<Token> tokens)
    {
        this.tokens = tokens;
    }

    // Metodo que inicia o processo de analise sintatica
    public void run()
    {
        this.tokens.add(new Token('$')); // token extra para sinalizar o fim da lista

        E();

        System.out.println("remaining tokens: " + this.tokens);
        if (this.tokens.size() != 1)
        {
            System.err.println("ERROR");
        }
        else
        {
            System.out.println("Sucesso!");
        }
    }

    // Metodo que implementa a regra E -> T | T + E
    private void E()
    {
        T();
        if (this.tokens.get(0).type == '+')
        {
            this.tokens.remove(0);
            E();
        }
    }

    // Metodo que implementa a regra T -> F | F * T
    private void T()
    {
        F();
        if (this.tokens.get(0).type == '*')
        {
            this.tokens.remove(0);
            T();
        }
    }

    // Metodo que implementa a regra F -> n | ( E )
    private void F()
    {
        if (this.tokens.get(0).type == 'n')
        {
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
                System.err.println("Falha!");
                System.exit(1);
            }
        }
    }
}

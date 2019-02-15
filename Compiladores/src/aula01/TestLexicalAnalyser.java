package aula01;

import java.util.ArrayList;

public class TestLexicalAnalyser
{

    public static void main(String[] args)
    {
        String exp = " 1 + 2.34";
        System.out.println("Input: '" + exp + "'");

        LexicalAnalyser la = new LexicalAnalyser(exp);

        ArrayList<Token> tokens = la.run();
        System.out.println(tokens);
    }
}

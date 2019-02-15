package compiladores;

import java.util.ArrayList;

public class TestLexicalAnalyser
{

    public static void main(String[] args)
    {
        String exp = " 1 + 2.0* ( 03 *4.56 + 78.9)";
        System.out.println("Input: '" + exp + "'");

        LexicalAnalyser la = new LexicalAnalyser(exp);

        ArrayList<Token> tokens = la.run();
        System.out.println(tokens);
    }
}

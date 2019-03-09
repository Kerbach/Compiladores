package aula03;

import aula02.*;
import aula01.LexicalAnalyser;
import aula01.Token;
import java.util.ArrayList;

public class TestInterpreter
{
    public static void main(String[] args)
    {
        String exp = "8/4/2";
        System.out.println("Input: '" + exp + "'");

        LexicalAnalyser la = new LexicalAnalyser(exp);
        ArrayList<Token> tokens = la.run();

        Interpreter sa = new Interpreter(tokens);
        sa.run();
    }
}

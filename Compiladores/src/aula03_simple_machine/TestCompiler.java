package aula03_simple_machine;

import aula01.LexicalAnalyser;
import aula01.Token;
import java.util.ArrayList;

public class TestCompiler
{
    public static void main(String[] args)
    {
        String exp = "1+(2*3)";
        System.out.println("Input: '" + exp + "'");

        LexicalAnalyser la = new LexicalAnalyser(exp);
        ArrayList<Token> tokens = la.run();

        Compiler sa = new Compiler(tokens);
        sa.run();
    }
}

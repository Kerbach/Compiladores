package aula03_simple_machine;

import java.util.Stack;

public class VirtualMachine
{

    private static int line = 0;

    // Metodo para indicar erro e a linha de sua ocorrencia
    private static void error(String s)
    {
        System.err.println("error in line " + line + ": " + s);
        System.exit(1);
    }

    public static void main(String[] args)
    {
        // Verifica argumentos
        if (args.length != 1)
        {
            System.err.println("please provide the input filename");
            System.exit(1);
        }

        Stack<Double> stack = new Stack<Double>(); // pilha de valores reais, inicialmente vazia
        String s;
        double a, b;

        // Abre arquivo especificado e executa cada linha lida do mesmo
        SimpleReader input = new SimpleReader(args[0]);
        while ((s = input.readLine()) != null)
        {
            line++;
            if (s.compareTo("ADD") == 0)
            { // operador de adicao
                if (stack.size() >= 2)
                {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a + b);
                }
                else
                {
                    error("ADD operation needs two values in stack");
                }
            }
            else if (s.compareTo("SUB") == 0)
            { // operador de subtracao
                if (stack.size() >= 2)
                {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                }
                else
                {
                    error("SUB operation needs two values in stack");
                }
            }
            else if (s.compareTo("MUL") == 0)
            { // operador de multiplicacao
                if (stack.size() >= 2)
                {
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a * b);
                }
                else
                {
                    error("MUL operation needs two values in stack");
                }
            }
            else if (s.compareTo("DIV") == 0)
            { // operador de divisao
                if (stack.size() >= 2)
                {
                    b = stack.pop();
                    if (b == 0.0)
                    {
                        error("cannot divide by zero");
                    }
                    a = stack.pop();
                    stack.push(a / b);
                }
                else
                {
                    error("DIV operation needs two values in stack");
                }
            }
            else
            {
                try
                {
                    a = Double.parseDouble(s);
                    stack.push(a);
                } catch (NumberFormatException e)
                {
                    error("invalid format for real value");
                }
            }
        }
        input.close();

        // Verifica resultado da expressao
        if (stack.size() == 1)
        {
            a = stack.pop();
            System.out.println("result: " + a);
        }
        else
        {
            error("only one value should be left in stack");
        }
    }
}

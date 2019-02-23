/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author wrkerber
 */
public class ContextFree
{
    private static void S()
    {
        int x = (int) (Math.random() * 4);
        if (x == 0)
        {
            
        }
        if (x == 1)
        {
            P();
        }
        if (x == 2)
        {
            C();
        }
        if (x == 3)
        {
            S();
            S();
        }
    }
    
    private static void P()
    {
        System.out.print("(");
        S();
        System.out.print(")");
    }
    
    private static void C()
    {
        System.out.print("[");
        S();
        System.out.print("]");
    }
    
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            S();
            System.out.println();
        }
    }
}

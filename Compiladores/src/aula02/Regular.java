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
public class Regular
{

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            generator();
        }
    }

    private static void generator()
    {
        int na = (int) (Math.random() * 10) + 1;
        for (int j = 0; j < na; j++)
        {
            System.out.print("a");
        }
        
        int nb = (int) (Math.random() * 10) + 1;
        for (int j = 0; j < nb; j++)
        {
            System.out.print("b");
        }
        System.out.println();
    }
}

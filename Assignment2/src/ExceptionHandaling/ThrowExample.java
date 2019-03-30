/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandaling;

/**
 *
 * @author FAZLE RAKIB
 */
public class ThrowExample {
    static void Exception()
    {
        try
        {
            for(int i = 5;i >= 0; i--)
            {
                System.out.println(200/i);
                if(i == 0)
                {
                    throw new ArithmeticException("New");
                }
                
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic Exception");
            throw e;
        }
    }
    public static void main(String[] args) {
        try
        {
            Exception();
        }
        catch(ArithmeticException e)
        {
            System.out.println("RETHROW");
        }
    }
}

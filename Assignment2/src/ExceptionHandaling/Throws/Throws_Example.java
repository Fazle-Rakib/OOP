/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandaling.Throws;

/**
 *
 * @author FAZLE RAKIB
 */
public class Throws_Example {
     static void Exception() throws ArithmeticException
    {
        System.out.println("Inside Execption"); 
        throw new ArithmeticException("New");
    }
    public static void main(String[] args) {
        try
        {
            Exception();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught");
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatchPac;

/**
 *
 * @author FAZLE RAKIB
 */
public class Try_Catch_Example {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        try {
            System.out.println("arr = " + arr[10]);
            int a = 200 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception\t:Array Index out of BOUND");
        }
        catch (ArithmeticException a) {
            System.out.println("Exception\t:ArithmeticException");
        }
    }
}

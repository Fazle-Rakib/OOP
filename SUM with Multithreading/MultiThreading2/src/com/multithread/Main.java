/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithread;
import java.util.Scanner;
public class Main {
            
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4};
        int[] b = {2,2,2,2};
        int[] c = new int[4];
        int[] result = new int[4];
        int total = 0;
        
        MultiThreadingClass1 t1 = new MultiThreadingClass1();
        Thread t = new Thread(t1);
        t.start();
        
        for(int i = 0; i < 4;i++)
        {
            c[i] = a[i]+b[i];
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e) 
            { 
                System.out.println ("Exception is caught"); 
            } 
        }
         try
        {
            t.join();
        }
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        }
        System.out.println("SUM Value Of Four Array : ");
        for(int i =0; i < 4;i++)
        {
            result[i] = c[i]+t1.c[i];
            total += result[i];
            System.out.println("[" +i +"]" +" : " + result[i]);
        }
        System.out.println("TOTAL SUM : " + total);
    }
}

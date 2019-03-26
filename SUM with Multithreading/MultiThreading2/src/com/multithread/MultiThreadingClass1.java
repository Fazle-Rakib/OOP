/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithread;

/**
 *
 * @author FAZLE RAKIB
 * Reg No:2017831030
 * 
 */
public class MultiThreadingClass1 implements Runnable{
    
    int[] a = {1,1,1,1};
    int[] b = {5,5,5,5};
    int[] c = new int[4]; 
  
    @Override
    public void run() {
        for(int i = 0;i < 4;i++)
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
    }
  
}

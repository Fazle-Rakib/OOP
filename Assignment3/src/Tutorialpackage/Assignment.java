package Tutorialpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAZLE RAKIB
 * Reg No:2017831030
 */
public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        newThread t1 = new newThread();
        newThread t2 = new newThread();
        Access obj = new Access();
        t1.setname("one",obj);
        t2.setname("two",obj);
        
        
        t1.start();
        t2.start();
       
        t1.join();
        t2.join();

        System.out.println("After Executing Multithread x = " + obj.num);
    }
}
class newThread extends Thread{
    String str  = "";
    Access obj;
     public void setname(String s,Access x){
        this.str = s;
        obj = x;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++)
        {
            try {
                obj.operation(str);
                System.out.println(obj.num);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(newThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
class Access{
    int num = 10;
    synchronized public void operation(String s)
    {
        if(s.equalsIgnoreCase("one")){
            this.num+=1;
        }
        else
        {
            this.num-=1;
        }
    }
}

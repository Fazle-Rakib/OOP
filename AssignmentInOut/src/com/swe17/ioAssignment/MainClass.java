package com.swe17.ioAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author FAZLE RAKIB
 * Reg NO : 2017831030
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\CONQURER\\2.1\\JAVA\\AssignmentInOut");
        if(file.exists())
        {
            System.out.println("File already Exits");
            file = new File(file.getPath(),"Beautiful Bangladesh.txt");
            if(file.exists())
            {
                System.out.println("Text File Exits");
            }
            else
            {
                file.createNewFile();
            }
        }
        else
        {
            file.mkdir();
            file.createNewFile();
        }
        
        BufferedReader input = new BufferedReader(new FileReader(file));
        String str;
        ArrayList <String> arrli = new ArrayList<String>();
        while((str = input.readLine()) != null)
        {
            StringTokenizer tok = new StringTokenizer(str," ,?!.-");
            while(tok.hasMoreTokens())
            {
               arrli.add(tok.nextToken());
            }
        }
        Collections.sort(arrli);
        int count = 1;
        for(int i=1; i < arrli.size();i++)
        {
            if(arrli.get(i).equals(arrli.get(i-1)))
            {
                count++;
            }
            else
            {
                System.out.println(arrli.get(i-1) + " : " +count);
                count = 1;
            }
        }
        
    }
}

package Module1.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Demo {
    static void main() throws IOException {
        System.out.println("Take Input");
        int input=System.in.read();
        System.out.println("input = " + (char)input);//A
        System.out.println("input = " + input);//65
        //input using Reader implemented classes class
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);//convert byte of data int char
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);//read data into chunks so no need to loop like read method
       String name =bufferedReader.readLine();
        System.out.println("bufferedReader = " + name );
        //Take input by using the Scanner Class
        Scanner scn =new Scanner(System.in);//internally take object of inputStreamReader class
        System.out.println("Enter your name please: ");
        String s=scn.nextLine();
        System.out.println(s);
        //for reading file input
        Scanner  scanner=new Scanner(new File("README.md"));
        while(scanner.hasNextLine()){
            String line= scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();







    }
}
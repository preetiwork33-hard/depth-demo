package Module.Basics.syntax;

import java.util.Scanner;//it appears after writing the Scanner class

public class UserInput {
    public static void main(String[] args) {
        //System.out.println("How to take input");
        Scanner scn =new Scanner(System.in);//we also discuss the Scanner class in the all predefined classes of java
        //after scanner, we are able to take input using object (scn) of this class its provide different method for datatypes like that
 /*      System.out.println("enter ID:");
        int studentID = scn.nextInt();
        System.out.println("id = " + studentID);
        System.out.println("Enter something ");
        String st=scn.next();
        System.out.println("st = " + st);
        System.out.println("student name: ");
        String studentName1=scn.nextLine();
        System.out.println("studentName is  = " + studentName1);
        System.out.println("Enter second student name: ");
        String studentName2=scn.next();
        System.out.println("second studentName is  = " + studentName2);
        */
        //Now run again
      /*  System.out.println("enter ID");
        int studentID = scn.nextInt();
        System.out.println("id = " + studentID);
        scn.nextLine();
        System.out.println("Enter something ");
        String st=scn.next();
        System.out.println("st = " + st);
        scn.nextLine();
        System.out.println("student name: ");
        String studentName1=scn.nextLine();
        System.out.println("studentName is  = " + studentName1);
        System.out.println("Enter second student name: ");
        String studentName2=scn.nextLine();
        System.out.println("second studentName is  = " + studentName2);*/
        //practice of two numbers sum problem by taking input
        System.out.println("enter number 1");
        int a=scn.nextInt();
        System.out.println("enter number 2");
        int b=scn.nextInt();
        System.out.println("sum ="+(a+b));







    }

}
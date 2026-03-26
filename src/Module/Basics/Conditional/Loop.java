package Module.Basics.Conditional;

import java.util.Scanner;

public class Loop {
    static void main() {
        /*Loops */
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        //while loop

        Scanner scanner = new Scanner(System.in);

        int count = 0;
/*        while (count < 3) {
            double balance = 2000;
            System.out.println("Enter age");
            int age=scanner.nextInt();;
            if (age>=18){
                System.out.println("Age is valid ");
                System.out.println("Enter amount ");
                int amount = scanner.nextInt();
                if (amount <= balance) {
                    System.out.println("remain balance  = " + (balance - amount));
                } else
                    System.out.println("Balance is not sufficient ");
            }else System.out.println("please your age is not valid");
            count++;
        }*/
        System.out.println("your attempt is finished try again" + count);
        //do While loop
     /*   do {
            System.out.println("execute once at least");
            count++;
        } while (count > 4);*/

        /*enhanced version of for loop Enhanced for loop*/
        int []arr={12,21,23,4,321,34};
        for (int value :arr){
            System.out.println("value = " + value);
        }

        //Interesting Fact about loops
/*        for (int i = 0; ; i++) {
            System.out.println(i);
        }*/
/*        for (;;) {
            System.out.println("Infinite");
        }*/
        //reverse loop
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
        //Zero times Run
        for (int i = 10; i < 5; i++) {
            System.out.println(i);
        }
        //do-while loop
/*
        while (input != -1) {
            input = sc.nextInt();
        }
        do {
            input = sc.nextInt();
        } while (input != -1);
*/


    }
}
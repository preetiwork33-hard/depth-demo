package Module.Basics.Operators;

public class Operators {
    static void main() {
    /*Arithmetic Operator*/
      int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        //*Compound Assignment Operators*//*
        int x = 10;
        x += 5;   // x = x + 5
        x -= 2;
        x *= 2;
        x /= 4;
        System.out.println("Assignment Result: " + x);
        //Postfix prefix increment concept
         int  fix_value =5;
         int prefix_value =++fix_value;
        System.out.println("prefix_value = " + prefix_value);//prefix_value = 6
        int value=34;
        int postfix_value= 123+value++;
        System.out.println("postfix_value = " + value);
        System.out.println("postfix_value = " + postfix_value);


        //*Relational Operators*//*
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        /*Logical Operators*/
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));
        //Bitwise
          //  &,|,^
                int bitNumber1 =5; //binary 101;
                int bitNumber2=3; //binary 11;
                int endValue=5&3;//(1&1=1 else 0)
                int orValue=5|3;//(0&0=0 else 1)
                int xorValue=5^3;//(similar bits =0 different bits =1)
                System.out.println("endValue ="+endValue);
                System.out.println("orValue ="+orValue);
                System.out.println("xorValue ="+xorValue);
              /*  Most confusing concept shifts operations let's make easy or crystal clear
                //>>right shift
                //>>left shift
                //>>unsigned right shift
                Ternery operator :beer alternative of if else statements */
        int value1 =1223;
        int value2 =122333;
        int result=(value1 > value2 ? value1 : value2);
        System.out.println("result ="+result);//print 122333
        byte bit =1;
        byte final_result = (byte) (bit<<7);
        System.out.println("result = " + final_result);
        /*Integer value shift operation */
      int i=1;
      int res = i<<32;//->32%32=0using N%32
      int res1=i<<33;//->33%32=1using N%32
      System.out.println("res = " + res);
      System.out.println("res1 = " + res1);
      
      


    }
}
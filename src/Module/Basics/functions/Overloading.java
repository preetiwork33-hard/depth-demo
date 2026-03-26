package Module.Basics.functions;
public class Overloading {
    static void main() {
        //call console method
     console();
     console(124214);
     System.out.println(adding(2535,152364));
     //overloading function call
        System.out.println(sum(123,213));
        System.out.println(sum(123,213,124234));
        sum("Preeti Kumari",20);
        /* chaining function print() call */
        print();

    }
    //Type of functions
     static void  console(){
        System.out.println("No input no output method ");
    }
    static void console(int id){
        System.out.println("input no output method ");
        System.out.println("id = " + id);
    }
    //return function (return type int)
    static int adding(int value1,int value2){
        return value1+value2;
    }
    //Function Overloading
   static int sum(int a,int b){
       return a+b;
    }
    static  int sum(int a ,int b,int c){
        return a+b+c;
    }
    static void sum(String name ,int age){
        System.out.println("name is "+name+" age "+age);
    }
    //Function changing
    //recursion an updated version of function changing*/
    static void print(){
        System.out.println("hello am \"Preeti here");
          print1();
    }
    static void print3(){
           print2();
    }
    static void print2(){
        System.out.println("meet my second friend Arnav ");
    }
    static void print1(){
        System.out.println("meet my  first friend Raman");
        print3();
    }



}
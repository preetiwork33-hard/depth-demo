package Module1;

public class Overloading {
    static void main() {
      /*  System.out.println( sum(23,234));
        sum("preeti kumari",500);//method calling
        System.out.println( sum(23,234));*/
        print();
    }
    //user want some interesting addition with same numbers but different orders
   static int sum(int a,int b){
       return a+b;
    }
    static void sum(int b,int a){
        System.out.println(a+b);
    }
        static void sum(String name ,int a){
        System.out.println("name = " + name+" "+a);
    }
    static  int sum(int a ,int b,int c){
        return a+b+c;
    }
    //Function changing
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
        System.out.println("meet my friend Raman");
        print3();
    }

}
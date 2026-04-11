package Module1.OOPS.nestedclasses;
//Nested Inner class and Local Inner class
public class Outer1 {
    int x = 10;
    class Inner1 {
        //now question is how access instance  of Outer class inside local-inner class
        Outer1 outer1; //internally jvm use
        int x = 20;

        void Fun() {
            System.out.println("I am Local Inner");
            System.out.println(x);//20
            System.out.println("x of outer class" + Outer1.this.x);//x of outer class10
        }
    }
        //LocalInner class
        void localMethod(){
        //effective final variable
        int value=22;
        value++;
             class Local{
                 /*auto copy inside the clas now it's an instance of class but when you try to modify 'value =22'
                  compiler stuck confuse which one is copy modified data or previous  */
                 int value=22;
                 int local_Value;
                 String name;
                 Local(int local_value,String name){
                     this.local_Value=local_value;
                     this.name=name;
                 }
                 void info (){
                     System.out.println("this local inner class crated by:"+name);
                 }
                 void print() {
                     System.out.println("local_Value = " + local_Value);
                    // System.out.println(value);
                 }
            }
            Local local=new Local(234,"Preeti kumari");
             local.print();
             local.info();
        }
    }
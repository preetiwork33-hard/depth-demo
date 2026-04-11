package Module1.OOPS.nestedclasses;

public class Test {
    static void main() {
        //object of Inner class
        //Outer outer=new Outer();
       // Implementation with Static inner class constructor
      //  Outer.Inner innerObj=new Outer.Inner(outer);
        //innerObj.print();
    //Implementation with method
       // innerObj.print(outer);
        /*Object of neste Inner class*/
        //First we create an object of outer class
/*          Outer1 outer1=new Outer1();
          Outer1.Inner1 inner= outer1.new Inner1();
          inner.Fun();*/
        /*Object of Local inner class */
        Outer1 outer2=new Outer1();
        outer2.localMethod();




    }
}
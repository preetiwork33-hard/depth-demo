package Module1.OOPS.nestedclasses;
//Static Inner class
public class Outer {
    static  int x=23;
    int y=123;
    static class Inner {
        Outer outer;
        //we also pass the reference inside the constructor
        Inner(Outer outer){
            this.outer=outer;
        }
        void print (){
            System.out.println("x:"+x);
            System.out.println("y:"+outer.y);
        }
        //using reference inside method
/*        void print (Outer outer){
            System.out.println("x:"+x);
            //System.out.println("y:"+y);
            System.out.println("y :"+outer.y);//Y :123

        }*/
    }
}
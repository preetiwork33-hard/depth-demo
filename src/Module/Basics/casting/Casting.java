package Module.Basics.casting;

public class Casting {
    static void main() {
    /*Implicit Casting */
        int number = 10;
        double value = number;   // int converted to double
     // /*Narrowing Casting */
        int value1=50;//yellow line suggest the concept of inline variable like  double value2 = 50;at the place of value1
        double value2 = value1;     // widening
        double x = 20.99;
        int y = (int) x;  // narrowing
        System.out.println("Widening: " + value2);
        System.out.println("Narrowing: " + y);
    /*Type Promotion */
        byte promote_value1 = 10;
        byte promote_value2 = 20;
        int result = promote_value1 + promote_value2;//if try to store the esult in byte it's show error
    /*Casting in objects */
        //Upcasting
        class Animal {}
        class Dog extends Animal {}
        Animal obj = new Dog();
        //DownCasting
        Dog d = (Dog) obj;
        //unexpected data loss
        int given_value = 130;
        byte find_value = (byte) given_value;
        System.out.println("find_value = " + find_value);// Output:-126;why ?

    }
}

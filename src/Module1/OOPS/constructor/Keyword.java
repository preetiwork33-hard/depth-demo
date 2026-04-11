package Module1.OOPS.pillar;

class Example{
    int id ;
    int age ;
    /*here we call all the current constructor of my class and ,
    also explain the concept of constructor chaining using this  */
    Example(){
        this (23);
        this.id =12;//for set the value

    }
    void print(){
        this.id =12;//for set the value
        System.out.println("ID is:"+id);
    }
    Example(int age ){
        this("Preeti kumari",23424);
        this.print();//call current methods by this
    }
    Example(String name, int value){
        System.out.println("name :"+name+"value is="+value);

    }
    void call(){
        System.out.println("here we pass the current object of class");
        //accesses current object by this
        show(this);//this is

    }
    //pass current class object in method
    Example show (Example e){
return new Example();//Module1.OOPS.pillar.Example@7a52f2a2
    }
    //return object by this
    Example setAge(int age) {
        this.age = age;
        System.out.println("set age for the Example return type ");
        return this; //here we return the Example object
    }

    void console() {
        System.out.println("age :" + age);
    }

}
//Please first comment the Sample class bock of code rather its repeat the value
class Sample2 extends Example{
    Sample2(){
        super(45);
        super.id=1223;
        System.out.println(super.id);

    }
    Sample2(int age){
        System.out.println(age);
    }
    void useCase(){
        super.print();//call parent class method using super
    }
}
public class Keyword {
    static void main() {
        Example e=new Example();
        //first call default constructor then call the single parameter and call two parameter the function call execute
        Sample2 s=new Sample2();

        System.out.println(e.show(s));
        s.call();
        //call console method
        e.setAge(10).console();//chaining



    }
}
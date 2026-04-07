package Module1.OOPS.nestedclasses;
final class Demo{
    private final String name;
    private final int age;
   //private final College college;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    Demo(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college=college;
    }*/
@Override
public String toString( ){
    return " My name is :"+name +"am"+age+" year old ";
}


}

class College{
    String  name ;
    String address;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }
     @Override
    public String toString( ){
        return " My name is :"+name +"college stable in "+address;
    }


}
public class Imutablity {
    static void main() {
        //College college =new College("IITG","Assam");
        Demo demo=new Demo("Preeti kumari",22);
        System.out.println(demo);
       /* Demo demo=new Demo("Preeti kumari",22,college);
        System.out.println(college.name);//IITG
        college.name="IITB";
        System.out.println(college.name);//IITB
        But Demo is immutable class so how its possible */
    }
}
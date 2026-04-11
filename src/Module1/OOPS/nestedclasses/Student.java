package Module1.OOPS.nestedclasses;

import java.util.Objects;

//Parent of all Classes
class Example extends Object implements Cloneable {
    String name;
    int age;

    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " My name is :" + name + "Am" + age + "year old ";

    }
    //How override equals


  /*This is not optimized way to write best Equals method
   @Override
    public boolean equals(Object obj) {
        Example e= (Example) obj;
        return e.age==this.age;
    }*/
    //Optimized way
  @Override
  public boolean equals(Object obj) {
      if (obj==this)return true;
      if (obj==null||getClass()!=obj.getClass()) return false ;
      Example e= (Example) obj;
      //return e.age==this.age;
      //if we have multiple data member to check us Object.equals()
      return e.age==this.age&&Objects.equals(name,e.name);
  }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

//   public native int hashCode();
public class Student {
    static void main() throws CloneNotSupportedException {
      Example object=new Example("Preeti Kumari ",23);
       // System.out.println(object.hashCode());
       // System.out.println();
        System.out.println(object);
      /*  if you try to access direct object without override to String
         its return something //(Module1.OOPS.nestedclasses.Example@4148db48)*/
       // System.out.println(object);// its give direct value of you object data because println() auto implement toString().
        Example object2=new Example("Supriya Sharma",23);
        //Equals method
        //System.out.println(object.equals(object2));//false
        //after Override equals
        System.out.println(object.equals(object2));//true
        //clone method
        Example object3=(Example)object2.clone();
        System.out.println(object3);//My name is :Supriya SharmaAm23year old
        object3.name="ardhya";
        //System.out.println(object3);// My name is :ardhyaAm23year old becuse by de





    }
}
package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

class Parent{
    void print (){
        System.out.println("Parent quality");
    }

    void show(){
        System.out.println("Parent Performance");
    }
}
class Child extends  Parent{
    private int age=12;
    void getAge() {
        System.out.println("age is "+age);
    }
    @Override
    void show(){
        System.out.println("child performance ");
    }


}
public class Test {
    static void main() {
 /*       Parent p=new Child();
        p.show();//am  child class show call by the super
        Child d=new Child();
        d.show();
        Parent p1=d;
        p1.show();*/
        // wild cards
        List<Child> child=new ArrayList<>();
                 child.add(new Child());
                 child.add(new Child());
                 child.add(new Child());
                 //fun(child);//Required type:List <Parent> Provided: List <Child>
        List<Parent>list=new ArrayList<>();
        list.add(new Parent());//Parent Performance
        list.add(new Parent());// Parent Performance
        list.add(new Parent());// Parent Performance
        fun(list);
        //but wee need flexibility with all child types and any type of list so we use Wild card
        List<Parent>wild=new ArrayList<>();
        wild.add(new Parent());//generics.wildcard.Parent
        wild.add(new Parent());//generics.wildcard.Parent
        wild.add(new Parent());//generics.wildcard.Parent
        //fun2(wild);
        List<Child> child1=new ArrayList<>();
        child1.add(new Child());//child performance
        child1.add(new Child());//child performance
        child1.add(new Child());//child performance
        fun2(child);

    }
    public static void fun( List<Parent> list){
        for (Parent p:list){
            p.show();
        }

    }
/*    public static void fun2( List<?> values){
        for (Object obj:values){
           //here we can call only Object class methods soo
            System.out.println(obj.getClass().getName());

        }

    }*/
    //wild cards generic with bounds
        public static void fun2( List<? extends Parent> values){
        for (Parent obj:values){
           //here we can call only Object class methods soo
           // System.out.println(obj.getClass().getName());
            obj.show();

        }

    }



}
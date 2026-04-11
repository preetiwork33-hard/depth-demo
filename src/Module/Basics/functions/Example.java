package Module.Basics.functions;
//Functions in java
public class Example {
    int age; String name ;
    Example(int age , String name){
        this.age=age;
        this.name=name;
    }
    static void main() {
        int x =4;
        int y=5;
        //call by value
        System.out.println("x,"+x +" "+"y" + y);
        add(x,y);
        System.out.println("x"+x +","+"y" + y);
        //call by reference
       Example obj= new Example(20,"prettier");
        System.out.println(obj.age+" / "+obj.name);//20 / prettier
        print(obj);
        System.out.println(obj.age+" / "+obj.name);//40 / prettierSharma
    }
    //call by reference
     static void print (Example o ){
        //here we pass the actual object value o.name not address of object so its effct the original object value and change them,
         // still here o.name is different from obj.name or obj.age
       o.name=o.name+"Sharma";
       o.age=o.age+20;
    }
    //call by value
    static void add(int a,int b){
       a+=10;
       b+=10;
       /*These a,b store in the different container that increase by 10 after function call but instead terminate
        so jvm read previous one x,y and print them
       */
    }

}
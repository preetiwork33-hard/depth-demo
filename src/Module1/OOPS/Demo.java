package Module1.OOPS;

public class Student {
 //   here we start a general student class
 static int id;
 static void main(String[] args) {
     Student student1=new Student();
     student1.id=123;
     System.out.println("student1 = " + student1);//Module1.OOPS.Student@276438c9
     System.out.println("Student ID is "+id);

 }
@Override
 public String toString(){
  return  "{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", roll_Number=" + roll_Number +
          ", college='" + college + '\'' +
          '}';
}

}
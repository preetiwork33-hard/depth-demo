package Module1.OOPS;
//here we talk about the classes and objects
class Student {
    String name ;
    int age ;
    int rollNo;
    String college;
    void markAttendance(){
        System.out.println("Attendance marked by the "+name );
    }
    void print(){
        System.out.println("student name: "+name +"student age "+age+"student rollNo: "+rollNo+"student College name: "+college );
    }
}
public class Main {
    static void main() {
        Student s1=new Student();
        Student s2=new Student();
        //First Student details
        s1.name="Divya";
        s1.age=21;
        s1.rollNo=12310213;
        s1.college="IIT Delhi";
        //Second Student details
        s2.name="Aditya";
        s2.age=23;
        s2.rollNo=12302434;
        s2.college="IIT Mandi";
        //  method calling for first(s1) object
        s1.markAttendance();
        s1.print();
      //  method calling for second(s2) object
        s2.markAttendance();
        s2.print();
    }
}
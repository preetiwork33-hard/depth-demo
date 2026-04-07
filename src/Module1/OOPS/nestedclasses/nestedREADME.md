# //nested classes in java 
class inside a class with has -A relation or used to logical grouping 

## Type of nested classes 
static inner class 
non-static inner class
* member inner class 
* local inner 
* anonymous inner class 

### static inner class inside a class with static keyword create when your inner class not coupled with object of outer class 
use case:
for helper or utility classes,load once in memory so for better memory efficiency.

### how to create object of static inner and syntax
Outer.Inner object =new Outer.Innenr();
take direct reference of the outer class pass the use reference variable like object now you access all static data of  static inner class or static data of outer class.

## Built Point
 * static inner class behave same as inner class still accept (1)built point also use specifier that make its so useful 
 * we also make a static inner class privet eor final 

**1.static** not access non-static data of outer class directly
//System.out.println("y:"+y);its give the error 
**how to solve?**
using reference of the outer class we are able to accesses nonstatic stuff of outer class inside static-inner class.  
**syntax:**
**Using Copy-Constructor** 

[Access non-static data from outer ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Outer.java#L7-L15)

**Using Methods**
[Access non-static data from outer ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Outer.java#L16-L21)
**Implementation**
[Access non-static data from outer ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Test.java)

### //nested Inner class :class inside the class without static keyword logically referenced by the object of Outer class 
 **Built points**
Local inner explain the best example of shallow and deep copy.
upto java 16 we not create static stuff inside inner class why? due to abuigity because static not depend on object but local inner is so compiler confuse to call the static method for inner class different objects .(how it solves we read in modern java)
**Syntax:**
[Inner ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Outer1.java)
**Implementation**
[Inner Object](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Test.java#L12-L16)

**Visual :**
what happen inside memory when we crate the object of local inner class 
[image of inner object-creation ](images/img.png)
What we do here :
let see  we have two x instance in the source code one inside the outer and second in Inner class but if I want to access Outer class data must have Object so pass type of class this refer to current class type object and .x use for the accessing data inside this instance variable
so we write (Outer.this.x)
`System.out.println("x of outer class"+Outer1.this.x);`

### Local inner class :these classes create inside the block ike if {},methods etc.

**Syntax:**
[Local inner class](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Test.java#L17-L41)

class 
Rule: 
behave same as normal class but local have Effective final(not use final keyword but still not modify)
variable rule :

### if we try to modify local data of local class block then its show error why because(Local class existence  depend on the block which inside it create but instance of local may we further use inside class  lets suppose my localMethod return local class object that used by the another method in outer class check code.)

In simple " /*auto copy inside the class now it's an instance of class but when you try to modify 'value =22'
compiler stuck confuse which one is copy modified data or previous  */"
`{
   int value=22;
   value++;
          void print() {
          System.out.println("local_Value = " + local_Value);
          System.out.println(value);//its give error 
               }
}`

##### **Think :**localMethod return local class object this is not possible then how ambiguity create  still localMethod return object of Object class that crate issue.

**Anonymous class**
### Anonymous class:A class without name to implement Interfaces or abstract class using these references alternative in updated  (lambda)
Syntax:
`{
      @Override
          public void start() {
               System.out.println("Please press the Start Button");
          System.out.println("speed time is "+SPEED_TIME+"seconds to reach 500 Km");
      }
};`
**Source code:**
with both type implementation with interface or Abstract class 
[for Abstract class ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Anonymous.java#L10-L18)

[for Interface](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/Anonymous.java#L19-L31)

Object creation inside memory of anonymous class : 
Anonymous class is compiled into a synthetic class (Outer$1.class), loaded into metaspace, and its object is created in heap like a normal class.
Either a temporary reference exists, or it is passed directly and then becomes eligible for GC.

visual:
what happen when compiler compiled the anonymous class :
[Anonymous class object](images/img1.png)
when you compile your Anonymous you have this type of structure in root folder
[Anonymous.Class](images/img2.png)
**Built points:**
Anonymous just a normal class with instance reference feature its take memory more than lambda 
we also crate methods inside the anonymous class but call inside the overridden methods
(**currently used lambda** instead of Anonymous classes)

## Immutable classes : A class whose object state cannot change after it is created.Once you create the object, its data is read-only
Syntax:
[Immutable class ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/.Imutablity.java#L2-L20)(its is not pure immutable class)
why we need immutable classes or objects in java ? java is more secure language due to its immutability features jav also have pre-built immutable classlike strings etc.In Multithreading, we learn importance of the immutable classes 
Rules:To create an object class
1. Make class final
2. Make fields private final
3. No setter methods
Initialize fields only via constructor
but this is not enough when we pass the mutable class as a data member inside Immutable class be able to set value through mutable class constructor 
Syntax: Also called shallow copy issue
[problem](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/.Imutablity.java#L25-L37-L12-L16)
Source code:
[Implementation](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/nestedclasses/.Imutablity.java#L44-L48)
**Why this happens ?** 
[memory storage](images/img3.png)
How to  make pure immutable class:
use defencive copy 
we return the object of mutable class not reference like that 
syntax:

   `void getter(){
   return new College(this.college.name,this.college.address);
              }
      Student (College college){
      this.college= new College(college.name,college.addresss)
            }`
Now it called pure immutable Class.
**Visuals:**
 [Behind the seen after this syntax](images/img4.png)
   Note: To create a pure immutable class be needed a deep copy of object  that means we passed a new object in getters or constructor instead of reference s of the objects because i any one have reference he can change the actual  object easily 

# Object class in java :In Java, Object class is the root (top-most) class of the entire class hierarchy.Every class in Java implicitly extends Object — even if you don’t write extends Object.

### Why Object Class Exists

**It provides common functionality for all objects:**
1. comparing objects
2. printing objects
3. cloning objects
4. runtime type info
5. synchronization support
6. garbage collection hooks
**This avoids duplication and ensures uniform behavior across Java.**

### common behavior of **Object class** for each java Child class:
core methods:
toString(),equals(),hashCode(),getClass()
//Cloning 
clone()
Garbage collection:
finallize()(deprecated method in current java versions)
Threads:
wait(),notify(),notifyAll()
Syntaxes of methods :

### toString() Method :predefined method in object class to return object with String Return type
Real signature :
`public String toString() {
       return getClass().getName() + "@" + Integer.toHexString(hashCode());
          }`
we can override that method with same signature to implement according to object data  
`@Override
public String toString( ){
       return " My name is :"+name +"am"+age+" year old ";
           }`

### Equals method:predefined method in object class to compare Strings (bases of literal not references) with boolean return type 
rule:
equals compare the content inside the references.

Real signature :
`public boolean equals(Object obj) {
          return (this == obj);
               }`
we can customize that method with same signature to compare your data fields

`@Override
public boolean equals(Object obj) { 
      if (obj==this)return true;//check for same object 
if (obj==null||getClass()!=obj.getClass()) return false ; check for null exception and class cast exception
                       Example e= (Example) obj;//cast Object class object given class type reference 
                                  //return e.age==this.age;
                  //if we have multiple data member to check us Objects.equals()
                         return e.age==this.age && Objects.equals(age ,e.age)&&Objects.equals(name,e.name);
              }`
*here you only pass the Object class if you want own reference type class use casting ,we also have == operator but its compare only references so we use equals

****Objects** It is  final utility class in package java.util contains static methods used for null-safe comparison  operations on fields level null check still use in custom equals
String a = null;
String b = "Java";
System.out.println(Objects.equals(a, b)); // if one is null but still work
**
Objects.equals(a, b) Internally it is 
` public static boolean equals(Object a, Object b) {
      return (a == b) || (a != null && a.equals(b));
}`
****
### clone method :

note:by default clone use  shallow copy we can change in actual object by using the reference of cloning object

### hashcode:its return the unique integer value for the objects in java

rules:
if we use equals by default hashcode() method overload 
if two objects are equal there hashcode must be equal 
**s.equals(s1) is true  s.hascode()==s1.hascode() must be true but reverse statement is not valid **
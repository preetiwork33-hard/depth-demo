# what is oops 
Object-oriented programming is the way to solve Real world problems using some logical chart flow most powerful concept for real industry solutions  
In this segment we are introduce class,objects or take a little bit overview of the pillars of Object-oriented programming.
* Inheritance : concept of inherit the parent class properties  and ability to contain self 
* Encapsulation :concept of dat wrapping 
* Abstraction : concept hiding but only internal processed logic  show functionality 
* Polymorphism : must be required to accesses  the data from different child classes using reference concept.
* note: we also discuss these all in depth
### what is class?
professional definition:A class is a blueprint or template used to define the structure and behavior of objects.
**A class contains:**
Variables (state)//now we use state term for variables
Methods (behavior)//same for methods use behavior
Constructors(special type of behavior without any return type)
class also contain another classes(concept of nested class)main class of java program is always public  
does NOT occupy memory until an object is created
Example:User, Order, Product are all classes of any enterprise Application
### what is Objects
professional definition:An object is an instance of a class that represents a real-world entity and occupies memory at runtime.

### craete object 
we have multiple ways to crate an object but in this README we only show using new ok
 Student student1=newStudent();
student1.id=123;


When object is created:
Memory allocated in heap(heap store the literal(student1=123) heap have value 123 at address of student1 in memory)
Reference stored in stack(store its reference /name of an object (student1))

### How object stores
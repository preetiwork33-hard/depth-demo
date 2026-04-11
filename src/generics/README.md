generics:
syntax:
[generics](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/UserData#L2-11)
for same PlaceHolder

[same placeholder](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/Coordinates#L12-24)
for different PlaceHolder
[different type Placeholder](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/Data#L25-34)
Note; generic resolve at runtime at compile time compiler remove generics and behave as simple class 
`class Data<Integer> user =new Data<>(34);`
 **compile time**
Data<Integer>   -->  Data
<T>        -->    Object
<T extends X>   -->    X
### generics methods : generic methods are same as jav methods with the <T> placeholder we can use these methods same as java concrete methods 

`public <T> void  show (){
System.out.println("this is generic method ");
}`
//generic methods with Generic return type
`public <T> T display(T data){
return data;
}`
**we also use pair in the generics methods**
`public <T,U> void display(T code,U collegeName){
System.out.println("College name:"+collegeName+" "+"code:" + code);
}`
###  overloading of generic methods rules 
*method can't overload just change the generic type.
`public <T> void  show (){
        System.out.println("this is generic method ");
    }
    //generic methods with Generic return type
    public <T> T show(){
    }` this syntax show compile time error because we not overload two generic methods only bases of return type like T,void at compile time its erase the generic syntax show both method are clash due to **type erasure** concept of generic. means compiler not know what is the <T>
**Check  for implementation:**
[Implementation code ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/Test.java#L57-73)

### why we need bounds in generics when it restricts the type or flexibility of generics?

bound is about freedom with type safety but not free to prevent the type safety and manage the optimized hierarchy or give instance compile time errors
before the bounds we can provide the <T> placeHolder that means it contain anything but bound restrict it <T extends Animal> now we can access the specific data of the Animal only, but we pass the reference of its subclass like   
`Implement<Dog> implement=new Implement<>(new Dog());`
`//implement.value.bark();` this code of line give error because we pass parent take reference of child but not access dog data due to bound in generics to accses dog dat we need the reference of dog and <T extends Dog>
**source code**
[Bounds in Generics ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/Bound.java#L29-46)
after this line of generic syntax:
we can also more restrict it using interface inside it like `<T extends Animal& implements Swimmable> `after this line of generic syntax: we can perform with only Fish class.
**source code :**
[Bounds with extra strict type  ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/generics/Bound.java47-63)

note If we pass like `Implement2<Fish> fish=new Implement2<>(new Fish()); `<T extends Fish & Swimmable> that means T replace with class type (Fish) and value hold the object of this class like new fish() becomes value of the genric class Implement2 ok
* if we extend a clss in genreric that means just a type not contain personal data of the class this dat always accessible by the <T> reference in these cases like` value.getValue bark();` because value is private so restrict to direct accesses

### Wild cards In generics : to solve the parent child relation issue in generics with prevention of type safety java intrduce generics 
generics are **invariant** in java due to type safety means if a class have is-A relationship but generic of these class are not like Dog is child of Animal but list of List<Dog>not child List<Animals>
Example:
`List<Dog> dogs=new AryList<>();
List<Animal> animals=dogs `
(in java generics not allowed this )in case of java arrays its possible but show run time error when we write or add some data at particular index like Array[4]=new Animal(); now we have dog object in heap until index 0,1,2,3 at four it try to put new Animal show exception *ArrayStore Exception**
if I create a list of any type of class like animal List<?>? this meant is we can give any type of list resolve at runtime  we accept if animal is the parent of the dog then we pass like that

`void printAnimal (List<Animal>list)`
//call like that
`printAnimal(dog)`//dog-> reference of Dog list, but it is not possible in generics because compiler does not work with .but if we **use wild card**
`void printAnimal (List<?>list){
list.add() ;//compile timeeero because compiler still not resolve the type of wildcard 
     object obj=list.get(0);//but it can read the data in the refence of Object because object store every type of data
}`
**Source code :**
[without wild cards ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/wildcard/Test.java#L41-45)
after using the wild card we add on in dog or parent class both but to store the refrence of this we usehte Object class check source code for with wild cards or without wild cards
[without wild cards ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/wildcard/Test.java#53-58)
source code : you can see the difference between the for each of both type  
[wild cards ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/wildcard/Test.java#59-65) why we store for each reference in the Object type because compiler don't know about the type soo we choose object it able to store any type of data we can also read the values of list using object class like   
`Object obj=values.get(2);
System.out.println(obj.getClass().getName());`
Using the bound in the wild cards generics  we can make them more flexible to read data without Object class 
note:still after the wild cards with Bound we cant add something in the list, but we have an optimized way to do this 
 we can use **super**  because we know its have parent or subtype of it 

### Add in the wildcard bounded generics with super keyword :
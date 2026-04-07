### Encapsulation: winding of data and behavior of object or restrict the unnecessary access of serious data using the private specifier in java with some logical conditions 
 in general, we use the getter setter method to accesses this private members

**Source code:**
[Encapsulation](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/BankAccount.java#L54-L61)

**implementation**
[Encapsulation implementation code ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Test.java#L5-L9)

### Abstraction: abstraction achieve in java by two ways using abstract class or interfaces here we see by abstract class
what is abstract class like a normal class with abstract keyword and with least one abstract method also contain data members and concrete methods.
not create constructors inside abstract class.
or not initialized (don't create an object of the abstract class )all method are implemented in nested class or implementing interfaces 

### why not create object of abstract class : because its create ambiguity between method calling compiler not decide which one actually call 

**using interfaces we have 90 % secure Abstraction compare to abstract class** 

Syntax:
`abstract class NewBankAccount{
abstract void deposit(double amount);
abstract void withdraw(double amount);
            }`

### Abstract methods : these are methods have no implementation provide the signature to next override methods . 

Source code:
[Abstraction](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/NewBankAccount.java)

**implementation code **
[Abstraction Example](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Test.java#L10-L15)

**how we override these abstract method 
we extend our class in next child class or override them then write own implementation logic**

**source code of implementation deposit withdraw in CurrentAccount class** 
[CurrentAccount](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/CurrentAccount.java#L10-L20)

**source code of implementation deposit withdraw in SavingsAccount class**
[SavingsAccount](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/SavingsAccount.java#L11-L25)

 **implementation**
[Abstract method implementation](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Test.java#L10-L15)

Note :using simple getter setter without any logic called week encapsulation 

### Difference 
Encapsulation : hide the serious data and restrict their accesses from outer world 
Abstraction: hide the complex implementation details from user only show functionality what actual happen behind the seen don't mine 

# Polymorphism: more important concept in oops to handle references (in simple thw ways to perform a single task )
NewBankAccount account1 = new SavingsAccount("Rahul", 5000); from test class of pillar package 

### rules: in polymorphism we can do only upcasting take reference parent and compiler decide the =  side execution which class object run.
here  new SavingsAccount("Rahul", 5000) is object of SavingsAccount class but reference is NewBankAccount class that called **Dynamic dispatch** in java (basically jvm decide at run time which  class object called ) in next segments we several time use this concept 
Syntax:
[polymorphism](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Test.java#L11)
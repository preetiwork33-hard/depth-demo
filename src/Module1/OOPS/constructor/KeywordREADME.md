we use super in the CurrentAccount or SavingsAccount what really mean how possible using this to access parent class data or this keyword in the constructor final and static keywords
this
super
static
final

### this its use take reference for current objects or constructors and methods of the present class
### super its use for the access parent class constructor methods and data members 

#### static  its use for class level data a that common for all data members, very special keyword in java that make our main method object independent so jvm internally crate object and run them t early stage without creating the object

#### final not modified use for constant values like PI and (g)

**syntax:**
static final int PI=3.14;
static final int G=10;

**uses of this and super**

### calling the constructor of current classes using this 

**source code:**
[using this](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Keyword.java#L7-L23)

### calling the constructor of parent classes using super

Source code
[using super](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Keyword.java#L32-L43)

**how we pass current object int this** 
Source code:

[pass Objet](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Keyword.java#L26-L35)
**How return object and chaining the method using this**

[return Objet](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/OOPS/pillar/Keyword.java#L35-L44)

**note:**
*this and super always first statement inside any block,method or constructor 
*super and this not called together in a single block 
all classes in java are subclasses of the Object class so by default suoer()no so error without extends class manually

//we also learn some advance concept in the next program session their we need.
**Note for super:**
super cant return objects we not pass objects 
using super 
**Functions in java**
function is a special type block of code in java used to perform a special task
java have to type functions UserDefined or InBuilt(PreDefined) 
UserDefined: user create inside a class to perform some operation like add Balance detailing printing data 
Predefined: java libraries or classes like Math,String,Object,util,lang classes already provide we can override them not rewrite like clone
to-string hashcode equals etc.
Syntax:
[All type Functions](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/functions/Overloading.java#L16-L27)

### function overloading 
method name must be same with different number of argument and also change order of appearance of parameter in the functions may have different return type. line of code  to  prove it 
**Why overloading:**
we have option to ewrite no of methods to take different input, but it is not optimized or readable so overloading resolve this issue when also reduce the bugs apperance because compiler warn to  provide specific parameters for different methods in the constructor overloading that concept is huge useful
#### source code 
[Function Overloading](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/functions/Overloading.java#L28-L37)
Error: change order means not same DataType parameters
`static int sum(int a,int b){
return a+b;
}
static int sum(int b,int a){
return a+b;
}`
* not valid overloading always use different type in same no or different numbers of parameters
* different return type not validate the overloading if you use different return type but use same no of parameters that not valid for
* 

### function changing
calling the function using another functions called changing of the functions.
**syntax:**
[Function Chaining](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/functions/Overloading.java#L38-L53)

note: A single method must be appeared that not contain any other function call like print2() else its call infinite changing
* most useful for the recursion cases read another Segment inside DSA.

### Pass by value /Pass by Reference
//most important or very confusing concept in java, but we read point to point without any glitch ready
Note to explain the concept here we use constructor that we cover in the oops 
*syntax:*
[call by value](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/functions/Example.java#L29-L36)
//first java is only pass by value not have any reference type concept pass by reference internally  follow the by value concept using  o.name or o.age. which copy the actual value not address.
*syntax:*
[call by Reference](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/functions/Example.java#L23-L28)

### visual 
[memory implementation in both cases](valueReference.png)
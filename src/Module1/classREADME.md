### function overloading 
method name must be same with different number of argument and also change order of appearance of parameter in the functions may have different return type.

#### source code 

https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/Overloading.java#L10

`static int sum(int a,int b){
return a+b;
}
static int sum(int b,int a){
return a+b;
}`
* not valid overloading always use different type in same no or different numbers of parameters 
* 
* different return type not validate the overloading
  https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/Overloading.java#L11,L16
* 




### function changing
calling the function using another functions called changing of the functions.
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/Overloading.java#L20
note: A single method must be appeared that not contain any other function else its call infinite changing
* most useful for the recursion cases read next sections of DSA.
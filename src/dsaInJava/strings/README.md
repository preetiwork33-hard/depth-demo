Strings: String is a characterArray then why String name ?
because String is the non-primitive conversion of the primitive data type that optimized the operation on characterArray and behave like a class Extend Object class 
Types oof create string:
using  new keyword with Constructor
String s1=new String("Hello");//using object
using literal
String  s1="Hello";//using literal
[sourceImg]()
**String constructors**
we pass the char arrays or byte array in a String class constructor check source code
[Strings](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/dsaInJava/strings/Test.java#L14-L24)
we have a constructor with parameters like 
`string str=new String(charArray,0,6)`
its use maths inclusive or exclusive logic of  set theory here **[0,6}**its count to 6 but execute only five characters
we also pass the reference of string inside the StringBuilder or buffer class 
[Strings references ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/dsaInJava/strings/Test.java#L25-30)

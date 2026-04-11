 **What Are Operators?**
A computer cannot understand human intentions, it only understands instructions and operations.
Example: int result = 5 + 3;
Operators are special symbols used to perform operations on variables or values.
Types:
 Arithmetic Operators:
 they allow to operands basic numerical calculations such as:
 addition
 subtraction
 multiplication
 division
 remainder
 | Operator | Meaning            
 | -------- | --------------
 | `+`      | Addition         
 | `-`      | Subtraction        
 | `*`      | Multiplication    
 | `/`      | Division            
 | `%`      | Modulus (remainder) Dividend ÷ Divisor = Quotient + Remainder
 [Arithmetic Operators](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L4-L10)

 Assignment Operator (=)
 Store the value on the right side into the variable on the left side
` int x = 5;
 x = x + 2;
 Step-by-step execution:
 x = 5
 x = 5 + 2
 x = 7`
 Compound Assignment Operators:
To reduce code length, languages introduced compound assignment operators.
 | Operator | Equivalent Expression |
 | -------- | --------------------- |
 | `+=`     | `x = x + value`       |
 | `-=`     | `x = x - value`       |
 | `*=`     | `x = x * value`       |
 | `/=`     | `x = x / value`       |
 | `%=`     | `x = x % value`       |
 [Compound Operators](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L11-L17)

 **Increment Operator ++**
 The increment operator increases a variable value by 1.
` int i = 5;
 i++;`
 **Decrement Operator --**
 The decrement operator decreases a variable value by 1.
` int i = 5;
 i--;`
 Use case:
 loop counters
 array indexing
 iteration
 **Prefix vs Postfix Increment**
 most confusing concepts in Operator Segment
check code
 [Postfix Prefix ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L18-L25)

 perform operation first and second use value.  
` int postfix_value= 123+value++;`
 use value first then perform operation.
 **Relational Operators**
 A computer cannot compare like humans. So we use relational operators to compare values. to make decision
 **Relational operators are used to compare two values or variables.The result in form of  boolean value.**
 | Operator | Meaning               | Example  | Result                   |
 | -------- | --------------------- | -------- | ------------------------ |
 | `==`     | Equal to              | `a == b` | true if equal            |
 | `!=`     | Not equal to          | `a != b` | true if different        |
 | `<`      | Less than             | `a < b`  | true if smaller          |
 | `>`      | Greater than          | `a > b`  | true if larger           |
 | `<=`     | Less than or equal    | `a <= b` | true if smaller or equal |
 | `>=`     | Greater than or equal | `a >= b` | true if larger or equal  |
 [write sourcecode ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L27-L31)

 **Relational operators are heavily used in:**
 Conditional Statements
 decision-making
 loops
 program logic
//Ternary Operator :Optimized version of if-else  we have to condition as true or false give boolean result on the basis of expression outcome like 
Syntax:
 [Ternary Operator](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L52-L56)
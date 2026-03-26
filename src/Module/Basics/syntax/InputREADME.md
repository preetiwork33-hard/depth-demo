## how take input in java using Scanner Class
most common bug at the input time like
source code:
[input bug ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/syntax/UserInput.java#L8-L21)

here we face something like that input : you notice am not able to input the name of first student its already take it next 
method text
**//outcome in console:**
enter ID:
23342
id = 23342
Enter something
thisisjustfortry nothing
st = thisisjustfortry
student name:
studentName is  =  nothing
Enter second student name:
pranav
second studentName is  = pranav
 **now question is how we solve it safe input in this type of cases is ?**
Syntax:
[write sourcecode ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/syntax/UserInput.java#L23-L37)
**why this problem occur?**

nextInt()and all data input method read only values and escape the line so we directly switch another input ,next() read character but not read lines so it also create problem and forward escape characters into next  input string.
**solve:**
best solution is using extra  scn.nextLine(); statement that read line between input 
//make a program to take input from user and add  numbers
[add two numbers](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/syntax/UserInput.java#L38-L43)
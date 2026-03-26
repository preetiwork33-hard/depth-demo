## how take input 
most common bug at the input time like
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/UserInput.java#L11
here we face something like that input : you notice am not able to input the name of first student its already take it next 
method text

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
 now quetion is how we solve it safe input in this type of cases is ?
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/UserInput.java#L24
nextInt()and all data input method read only values and escape the line so we directly switch another input ,next() read character but not read lines so it also create problem and forward escape characters into next  input string.
# Loop also called conditional statements here we use  for iteration
**why loops ?**
think a scenario where you perform a logic inside your business logic this is  a repeated task, and you want its execution until condition is false
what do you do ? then Lops come into the picture
* where you use loop?
  "Repeat a block of code until a condition becomes false"
* every loop contain three fundamental terms :
* Initialization
* Condition
* Update
**types of Loops in Java**
* For Loop
* While Loop
* Do while Loop
**For loop**
* for source code 
  https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Loop.java#L9

`  for (int i = 0; i < 10; i++) {
  System.out.println("i = " + i);
  }`
**Execution flow**

  | Step | i value |   | Condition (i < 10) | Output    |
  |:----:|--------:|---|--------------------|-----------|
  |  1   |       0 |   | true               | i = 0     |
  |  2   |       1 |   | true               | i = 1     |
  |  3   |       2 |   | true               | i = 2     |
  | ...  |     ... |   | ...                |           |
  | ...  |     ... |   | ...                | ...       |
  |  10  |       9 |   | true               | i = 9     |
  |  11  |      10 |   | false              | stops     |
**Interesting fact about for Loop**
we also use for loop without any condition by default its consider true and behave like an infinite loop
check source code using link:
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Loop.java#L45,48
we also use for loop without any condition by default its consider true and behave like an infinite loop
we also write the syntax without any terminologies like initialization or condition
~~warning~~ not try else terminate terminal immediately
reverse loop use full in Algorithms
  https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Loop.java#L52
**execution flow** 
Zero times Run
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Loop.java#L52
why ? because just after the initialization condition is not true so iteration not execute single time but not infinite loop ok
**Why while ?**
not all problems are count-based some time logic need boolean return type or some validationslike that 
`while (input != -1) {
input = sc.nextInt();
}`so we need while loop 
* for = controlled repetition
* while = condition-driven repetition 

**then why do_while?**
when we need execution of a statement at least once like store the game stage of any user
check syntax:
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Loop.java#L60
as beginner stage we write input statement inside the while that not write always write inside the do block Ok for infinite as same use while conditions 
**Enhanced for loop** its just updated version of for loop to print value in the collection or data structures like list or array ~~warning~~ not use for accesses iterations
**Memory management**
Loops don’t consume memory but logic inside it decide memory or complexity of your loop so you can use any loop to perform an action but still always prefer according to the logic requirement OK
~~not try infinite loop always check condition before run the code because infinite loop is harmful for your memory of cpu ok~~ 






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
  [print numbers](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L6-L9)
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

**While loop** Best use in the conditional iteration not more optimmized then for loop just a special for some use cases 
[Balance validation](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L13-L30)

**Do while** in this type loop run at least once a time to print statment inside do block 
syntax:
[Example menu](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L31-L35)
here a blocko fcode once run then check while condition is true run again increment count if false terminate instantly
Mostly use in the Menus screen to users in game etc.

**Interesting fact about for Loop**
1.we also use for loop without any condition by default its consider true and behave like an infinite loop
2.we also use for loop without any condition by default its consider true and behave like an infinite loop
we also write the syntax without any terminologies like initialization or condition
Source code:
[Infinite loops](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L44-L53)
~~warning~~ not try else terminate terminal immediately

**reverse loop use full in Algorithms**
we also iterate a loop in reverse pattern give same result  but not recommended.
[reverse iteration](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L55-L57)
 
**execution flow** 
Zero times Run
                `for (int i = 10; i < 5; i++) {
                System.out.println(i);
                }`
why ? because just after the initialization condition is not true so iteration not execute single time but not infinite loop ok
**Why while ?**
not all problems are count-based some time logic need boolean return type or some validations like that 
              `while (input != -1) {
              input = sc.nextInt();
              }`

* for = controlled repetition
* while = condition-driven repetition

_**as beginner stage we write input statement inside the while that not write always write inside the do block Ok for infinite as same use while conditions_** 

**Enhanced for loop** its just updated version of for loop to print value in the collection or data structures like list or array ~~warning~~ not use for accesses iterations
**Source code:**
[Enhanced loop](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/conditional/Loop.java#L38-L41)

**Memory management**
Loops don’t consume memory but logic inside it decide memory or complexity of your loop so you can use any loop to perform an action but still always prefer according to the logic requirement 

~~not try infinite loop always check condition before run the code because infinite loop is harmful for your memory of cpu  
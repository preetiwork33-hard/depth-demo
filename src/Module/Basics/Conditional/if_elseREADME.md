**here we discuss the inner concepts of execution flow of all conditional statements.**
* Statements: ....A statement is a single instruction that Java executes Examples 
int a = 10; System.out.println("Hello");int x;if (x > 0) { }
* Expression: ....An expression is anything that produces a VALUE Examples
5 + 3, a*b, (a > 5 && b < 10)
## In java, we majorly use three control statements If-else else-if or only if in nested form
**IF** 
control flow of **if** only condition is true block of code is execute.
**For source code**
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Decisionmaking.java#L10
Execution Flow (Important)
Step-by-Step Flow
           Start
              ↓  
           check condition
               ↓
           execute  block
otherwise flow forward to next.
**IF-Else** we used when we have two scenario true or false (alternative Ternary operator )but we also use multiple logic inside these statements compare to ternary operator)
but Ternary is useful only two conditions verification
**For source code** 
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Decisionmaking.java#L24

with if else we have two choices condition is true then if block either else block execute
           Start 
               ↓
           Take Input (n)
               ↓
           Check (n % 2 == 0)
              ↓
           Yes → Even No → Odd 
              ↓
            End
**Else-If Leader** when we need multiple checking point in the logic to execute the specific code
**For source code**
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Decisionmaking.java#L28

                    Start
                        ↓
                    Input Marks
                         ↓
                    marks > 70? → Yes → Grade A
                        ↓
                    No marks > 55 ? → Yes → Grade B 
                        ↓
                    No marks > 33 ? → Yes → Grade C 
                        ↓
                    No marks == 33 ? → Yes → Just Pass 
                         ↓
                    No Fail
always parented by if so first,if condition check is true then  flow jump into the closest else-if 
**Note** the best alternative is switch statement instance of if -else when we have some constant condition checking (we will study switch in same module )
else-if is true then its execute either check next else-if after go through each else-if it's execute else condition if present in your logic  

**note**
we complete a task using multiple ways in programming but optimization of code ,complexity, readability matter so always choose optimized way
OK.


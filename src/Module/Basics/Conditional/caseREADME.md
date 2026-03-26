# Learn about switch

### why do switch exists when we have if -else leader or why do not remove if-else leader from java ?

switch is the best alternative of if-else leader in constant literal comparing case .but its have some limits,
switch use only byte int short char string and object also in updated versions so we don't remove if-else leader 
we not use duplicate cases in the switch but still use in the if-else leader
**Syntax Before jdk7**
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Cases.java#L11

#### note:here we not discuss the boring execution flow we make some interactive in text form ok

### Execution flow
                 Program receives a value in day
                 It checks:
                 Is day == 1?
                 Else is day == 2?
                 Else is day == 3?
                 When a match is found:
                 Print corresponding day
                 break stops further checking
                 If no match:
                 default executes
### check code for fall throw issue solution
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Cases.java#L44
### Execution flow
                  The switch checks value of num
                  When a matching case is found:
                  Execution starts from that case
                  Since there is no break:
                  Execution continues to next cases (fall-through)

### Syntax after jdk7
be remove break and use string as an expression inside switch
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Cases.java#L55
### Execution flow

### switch as an expression check syntax 

https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Conditional/Cases.java#L66
### Execution flow

## _Note:_
here we use keyword yield we discuss later for current understand it's just return the case value use always inside block 
here default also provide the exception handling facilities not optional like other syntax of 

### switch vs if -else 
switch can only test equality but if else can both equality or inequality 

##### switch is more efficient  compare to java how?
switch use jump table for direct accesses inside Jvm.Jvm has two type of jump table 
1. switch table -use for the dense or continious data like case1,case2, case3....
2. lookup table -use for the sparse data like case1,case2,case100,case1000 .... for this scenario we internally apply binary search for optimization
 enum use .ordinal()methiod to convert that constant into int 
3. String data use **lookUp table** for case match because hashcode of string are not continuous or dense String use ,hascode() to integer value and equals for case Ignorance
**how  switch proceed internally?**
Let's suppose switch have the **n no of cases** then switch no need to go through one by one like (if-else leader)its directly match the constant expression value with cases
   
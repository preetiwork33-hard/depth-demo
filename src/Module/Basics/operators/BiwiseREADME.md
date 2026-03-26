# Bitwise operator
here we talk in depth step to step execution or storage
please run this code itself without casting and see the different answer with sign
[bit ByesOperators](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L38-L47)
**Please run this code with casting or without casting** 
you see some major diffrence in output due to type promotion in `shift operators 
byte bit =1;
byte result = (byte) (bit<<7);
//int result =bit<<7
System.out.println("result = " + result);
// -128 without casting`

check  image for the clarification one by one bit shifting.
**Visuals how shifting perform internally checkout please**
[Shift operation on byte ](byteshift.png)
Source code:
[Shift operators ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/operators/Operators.java#L64-L70)

**note** :
internally all shift operation follow type promotions how check this and think above code lines-
(without casting its give error when wwe store the result in int its give positive 128even in byte casting its give -128)
check image for the shift operation internally with int datatype.
when we shift the int with MSB(int MSB is 31) after that shift use N%32 because 
**int value >>32 ~0** 
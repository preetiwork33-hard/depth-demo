# Bitwise operator
here we talk in depth step to step execution or storage
please run this code itself without casting and see the different answer with sign 
`byte bit =1;
byte result = (byte) (bit<<7);
//int result =bit<<7
System.out.println("result = " + result);`// -128 without casting its give you error
check  image for the clarification one by one bit shifting.
[Shift operation on byte ](byteshift.png)
note internally all shift operation follow type promotions how check this and think above code lines-
(without casting its give error when wwe store the result in int its give positive 128even in byte casting its give -128)
check image for the shift operation internally with int datatype.
when we shift the int with MSB(int MSB is 31) after that shift use N%32 because 
**int value >>32 ~0** 




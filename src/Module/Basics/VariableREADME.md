#  check source code for syntax
1. What is the difference between a Variable, an Identifier, and a Literal?
   Variable: The container/memory location itself
   Identifier: The unique name you give to that container (e.g., firstNumber)
   Literal: The actual value stored inside the container (e.g., 10, 5.5, 'A')

2. Why are there four different types for whole numbers (byte, short, int, long)?
   It is all about memory efficiency. Each type occupies a specific amount of space (bits)
   byte (8-bit): Used for very small ranges (-128 to 127).
   short (16-bit): Used for slightly larger numbers.
   int (32-bit): The standard choice for integers.
   long (64-bit): Reserved for massive values (quadrillions).

3. What is the difference between "Declaring" and "Defining" a variable?
   Declaration: Telling the computer a variable exists and what its type is (e.g., int x;)
   Definition: Assigning a specific value to that variable (e.g., x = 5;)
   Initialization: Doing both at the same time (int x = 5;)
 
4. Can I name my variables anything?
   No. You must avoid Keywords. These are 68 reserved words (like public, static, class) that Java uses for its internal logic
    You cannot use these for your own naming
--------------------------------------------------------------------------------
 Advanced Insights: Deep Dive into Java Internals
1. Why is a byte range specifically -128 to 127?
   Java uses signed numbers, meaning the 8 bits of a byte are divided to represent both positive and negative values
    While 8 bits can create 256 unique combinations (2
   8
   ), one bit is used to denote the sign. This splits the range into negative values and positive values, including zero, resulting in the -128 to 127 range
   
2. Why is double preferred over float in modern development?
   Even though float uses less memory (32-bit), double (64-bit) is the industry standard for two reasons
   Precision: double offers "Double Precision," which is vital for scientific calculations
   Hardware Optimization: Modern processors are specifically optimized for double calculations, often making them faster than float in real-world performance
   Java Defaults: Most built-in Java math functions (like sin or cos) return double values.

3. How does Java handle international characters compared to older languages?
   Older languages like C used the ASCII standard (8-bit), which only covered basic English characters
   Java uses Unicode (16-bit for char), allowing it to represent characters from almost every language in the world, including Hindi, Chinese, and Greek
   
4. Are there "useless" keywords in Java?
   Yes. Keywords like goto and const are reserved by Java but are not used in the language
   They were reserved early on (similar to C++) but Java's creators eventually built the language without needing them. However, you still cannot use them as variable names

5. why use f literal after the floating value declaration ?
   because maximum no of OS is optimized for double values so java by default consider double without **f** literal
   `float f= 23.1232f;`
 
--------------------------------------------------------------------------------
Tips for Developers
Readability: Use underscores in large numbers to make them readable (e.g., long population = 1_000_000_000;). The compiler ignores them
Binary/Hex Support: You can assign values using different number systems
See the implementation here:
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/VariableExample.java#L32

[range of the datatypes ](img.png)

Static Typing
Java is statically typed, meaning you must declare the data type (int, float, etc.) before the code compiles so the system knows exactly how much memory to allocate

# Advanced: The Logic of Negative Numbers
Java represents negative numbers using Two's Complement
Here is the internal process for storing -42 in a byte:
Ignore the sign: Find the binary of +42 (00101010)
First Complement (1's): Invert all bits (11010101)
Second Complement (2's): Add 1 to the result (11010110)
Concept Clarity: The Most Significant Bit (MSB)—the leftmost bit—acts as the sign indicator. If it is 1, the number is negative; if 0, it is positive

**Floating Point Internals (IEEE 754)**
Why 0.7f is not exactly 0.7
When you store a number like 0.7f, it cannot be perfectly represented in binary and results in an infinite repeating pattern
. Java truncates this data to fit into 32 bits, leading to slight precision errors (e.g., 0.6999999...)
.
**The 32-bit Memory Layout**
A float is divided into three parts based on the IEEE 754 standard

Sign Bit (1 bit): Defines positive or negative
Exponent (8 bits): Stored with a Bias of 127 to ensure the stored exponent is always positive for the processor
Mantissa (23 bits): Stores the actual fractional digits
Retrieval Formula
To get the value back, Java uses: (−1)
sign
×(1+Mantissa)×2
(Exponent−Bias)
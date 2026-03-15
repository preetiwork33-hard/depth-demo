1. **What is the difference between JVM, JRE, and JDK?**
   Think of these as concentric circles, each building upon the other:
   JVM (Java Virtual Machine): The core engine. It takes bytecode and converts it into machine code that your specific processor understands
   It also handles security (Sandbox model) and memory (Garbage Collection)
   JRE (Java Runtime Environment): JVM + Class Libraries. You need this to run Java programs. The libraries provide the pre-written code (like printing to a console) that your program needs to function
   JDK (Java Development Kit): JRE + Development Tools (Compiler, Debugger, etc.). You need this to write and develop Java programs
   
2. **Is Java a Compiled or Interpreted language?**
   Java is both. This is a unique feature that provides a balance between speed and portability
   Compilation: The javac compiler converts your .java source code into an intermediate format called Bytecode (.class file)
   Interpretation: The JVM then uses an Interpreter to read that bytecode line-by-line and execute it

3. **What is the JIT Compiler and why do we need it?**
   In modern Java, the JVM uses a Just-In-Time (JIT) Compiler alongside the Interpreter
   The Concept: The Interpreter is fast to start but slow for repetitive tasks. The JIT compiler identifies "frequent" or "hot" code and compiles it directly into machine code for much faster execution
   The Benefit: This hybrid approach makes Java nearly as fast as purely compiled languages like C++ while remaining portable
   
4. **Why is Java called "Platform Independent"?**
   Java follows the WORA principle: Write Once, Run Anywhere 
   When you compile Java code, it creates Bytecode, which is platform-neutral 
   You can take that same bytecode to Windows, Linux, or macOS. As long as that system has its own platform-specific JVM, it can run your code
   
5. **JSE vs. JEE vs. JME: Which one should I focus on?**
   JSE (Java Standard Edition): This is "Core Java." It includes all the fundamental concepts like OOPs, classes, and methods. As a beginner, start here
   JEE (Java Enterprise Edition): Now known as Jakarta EE. It is used for building large-scale web applications and websites
   JME (Java Micro Edition): Used for old mobile phone applications. It is largely obsolete today, replaced by Android development

**Your First Java Program**
To run your first program, follow these steps in your terminal:
Write Code: Create a file named Demo.java.
Compile: Use the command javac Demo.java. This generates Demo.Class (Bytecode)
Run: Use the command java Demo. This triggers the JVM to execute the bytecode and show your output

`// Example: Demo.java
public class Demo {
public static void main(String[] args) {
System.out.println("Hello World");
}
}`
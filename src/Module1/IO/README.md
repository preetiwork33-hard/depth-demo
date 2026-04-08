# History of updated class of input Scanner in java 
 java have inputStream class for take input from console that read bytes need to type cast so java next introduce Reader class it read the Stream of characters 
**streams:flow of data** 
inputStream class is an abstract class so its have a **read()** abstract method that override by the implemented classes 
 **read()**it is read one byte at a time with int return type
syntax:
 [Scanner input ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/IO/Demo.java#L13-L16)

##  Taking input by the InputStreamReader class
Step1:
its take object of input steram class object inside his constructor and convert bytes Stream into the charStream 
Step2:
 pass this inputStreamReader object inside bufferReader class the read the charactersn chunks
 [Scanner input ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/IO/Demo.java#L17-L21)
**if we have this type then why Scanner?**
it so complicated syntax wise compare to other Languages second one it is read only string type for another type we need casting using wrapper methods, but most optimized in case of large data reading to reduce the complexity or to read versatile type of input  introduceScanner class.

## Taking input in java using Scanner
java introduce Scanner in 1.5 is modified class off inputStream or Reader that internally use System.in object of inputStream class  
**syntax:**
[Scanner input ](https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module1/IO/Demo.java#L22-L26)
**note:**
scanner use the tokens to reading input from consoles or files.
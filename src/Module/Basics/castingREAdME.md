# Type Casting in Java

## 1. Introduction

**Type Casting** in Java means converting a variable from one data type to another data type.
Sometimes while writing programs we need to store a value of one type into another type. Java allows this conversion through **casting**.


In Java, casting is mainly divided into **two types**:

* **Widening Casting (Implicit Casting)**
* **Narrowing Casting (Explicit Casting)**

---

# 2. Why Type Casting Exists in Java
sometimes we have no idea about the dat storage but after the logic we need wider data like in case of starting number of any AadhaarID
so casting is needed but java narrow to wider perform automatically but in case of narrow programmer do manually.

Example:
`  int  x = 202525;
       byte y = (int)x;`

Sometimes we need to:
* Store a **smaller type inside a bigger type**
* Convert a **bigger type into a smaller type**

To perform these conversions Java provides **Type Casting**.

# 3. Widening Casting (Implicit Casting)

### Definition

When a **smaller data type is converted into a larger data type automatically**, it is called **Widening Casting**.

This conversion is done **automatically by the Java compiler**.
like all integer value convert to int to long

### Conversion Order
```
byte → short → int → long → float → double
```
### Example
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L6

### Why It Is Safe
Because:
* Smaller type → larger type
* No data loss occurs.

# 4. Narrowing Casting (Explicit Casting)

### Definition

When a **larger data type is converted into a smaller data type manually**, it is called **Narrowing Casting**.

This conversion must be done **explicitly by the programmer**.
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L9

### Important Point

The **decimal part is lost** during conversion.

This is called **data loss**.


# 5. Type Promotion During Expressions

When Java performs arithmetic operations, smaller data types are **automatically promoted to int**.
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L15


### Why Result Is int?

Because Java automatically promotes `byte` and `short` to **int** during arithmetic operations.


# 6. Real World Analogy

Imagine you have a **small bottle and a big bottle**.

### Widening Casting

Pouring water from **small bottle → big bottle**
Nothing is lost.

### Narrowing Casting

Pouring water from **big bottle → small bottle**
Some water may **overflow (data loss)**.

# 7. Casting in Object References (Advanced)

Type casting also happens in **inheritance**. Don't worry we learn inheritance in next oops module 

Example:

### Upcasting
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L21


Here a **child object is stored in a parent reference**.

This is called **Upcasting**.

### Downcasting
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L24

# 8. Common Mistakes
### 2. Unexpected Data Loss
reason :  java forget all extra bits only keep last significant bits of Target type For positive numbers, we used the
formula: Result = Value % Range of Target Type
Example: A byte has 256 possible values. If you cast the integer 300 to a byte, the calculation is 300 % 256, which equals 44
https://github.com/preetiwork33-hard/depth-demo/blob/master/src/Module/Basics/Casting.java#L26

# 9. Key Points to Remember

* Type casting converts **one data type into another**.
* Two types:
    * **Widening (Automatic)**
    * **Narrowing (Manual)**
* Widening casting is **safe**.
* Narrowing casting may cause **data loss**
* Arithmetic operations promote smaller types to **int**.
* Casting also occurs in **object references** (Upcasting and Downcasting).

**Conclusion**

Type Casting is an important concept in Java used when converting values between different data types. Understanding the difference between **widening and narrowing casting** helps developers write safer and more predictable programs.

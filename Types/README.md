# Types

* ### *What types does the language support?*
  #### C# Value Types:
  * bool
  * byte
  * char
  * decimal
  * double
  * enum
  * float
  * int
  * long
  * sbyte
  * short
  * struct
  * uint
  * ulong
  * ushort

  #### C# Reference Types:
  * class
  * delegate
  * dynamic
  * interface
  * object
  * string

  #### Java Value Types:
  * boolean
  * byte
  * char
  * double
  * float
  * int
  * long
  * short

  #### Java Reference Types:
  * array
  * interface
  * object
  * string

* ### *Are both reference and value types supported?*
  In both Java and C# there are value types and reference types.
  Value types are held on the stack, whereas the reference types are on the heap.
  When modified, value types change their data directly, while reference types change their pointer to a different location in memory.
  Java is a strictly pass-by-value language.
  However, C# has a keyword called 'ref' that allows any type to be passed by reference.

* ### *Can new value types be created?*
  In Java, new value types can not be created.
  However, in C#, new value types can be created and user-defined structs can also be created.
  This is done by extending the ValueType Class with a custom class.

---
[C# Program](types C#)

[Java Program](types Java)

[Home](../README.md)

# Unique Features
* Does the language have any particularly unique features?
## Java
* Everything must exist in an object
	In java, fields and methods cannot be stand alone, they must be within a class. Class methods and fields can be called on the class itself since there is only one copy, but instance variables/methods can only be used if a class is instantiated.
* Garbage Collection
	The garbage collector runs on the JVM and frees up memory when objects are no longer used. This is helpful for the developers because they no longer have to manually manage memory, but the developer does not know when the memory gets cleaned up.

## C#
* Uses Assemblies
	This is an encapsulation above the namespace. Assemblies can be treated like libraries in other languages. Members in an assembly can be "internal" which makes them public within the assembly, but private outside the assembly.
* Uses extension methods to add to a class
	Extension methods are special methods that can be added to an existing type without the use of subclassing. Extension methods are static and are called like instance methods.
* Partial classes and methods
	Using the "partial" keyword a class, struct, interface, or a method can be split up into multiple files. All parts are combined when the code is compiled. This allows multiple developers to work on the same method/class/struct/interface at the same time.
* dynamic type
	The type of the variable using the "dynamic" keyword will not be decided until run time. The dynamic type makes it easier to interact with COM/dynamic APIs or things like the DOM. In most cases, the dynamic type variable behaves like an object type. 

[External Link: features of various programming languages](http://dafoster.net/articles/2013/01/29/unique-features-of-various-programming-languages/)

[External Link: Java Variables]
(https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

[External Link: Java Garbage Collection]
(https://en.wikipedia.org/wiki/Garbage_collection_%28computer_science%29)

[External Link: C# Extension Methods]
(https://docs.microsoft.com/en-us/dotnet/articles/csharp/programming-guide/classes-and-structs/extension-methods)

[External Link: C# Partial Classes]
(https://docs.microsoft.com/en-us/dotnet/articles/csharp/programming-guide/classes-and-structs/partial-classes-and-methods)

[External Link: C# Dynamic Keyword]
(https://docs.microsoft.com/en-us/dotnet/articles/csharp/language-reference/keywords/dynamic)

[Home](../README.md)

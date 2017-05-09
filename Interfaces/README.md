# Interfaces
* ### *What does the language support?*
Both C# and Java support interfaces. An interface is a description of the actions that an object can do... for example when you flip a light switch, the light goes on, you don't care how, just that it does. In Object Oriented Programming, an Interface is a description of all functions and properties that an object must have in order to be an "X". So in essence, it is a programming structure/syntax that allows the computer to enforce certain properties on an object (cs.utah.edu). 

* ### *What abilities does it have?*
The abilities that I will mention are for both Java and C#:

1. An interface can declare any number of methods but they all need to be abstract (you cannot provide an implementation for it).

2. It can contain properties; but be careful none of the properties can be instance fields. In java: Any fields in the interface need to be either static or constant. 

3. You cannot create an instance from an interface; thus it is easy to see that an interface does not contain consturctors.

4. You can never extend an interface; you can only implement it (in java using the word implement, and in C# using the colon :). However you can implement as many interfaces as you want.

5. An interface can extend many other interfaces.

* ### *How is it used?*


---
[Home](../README.md)

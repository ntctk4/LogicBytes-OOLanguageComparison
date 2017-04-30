# Memory Management

* ### *How is it handled?*
  In both C# and Java, developers do not need to allocate or deallocate memory.
  
  Memory is managed automatically in these languages.

* ### *How does it work?*
  In both languages, when an object is created, memory is allocated for it and its constructor is ran.
  
  Once there are no longer references to the object for it to be used, it is able to be destroyed and its memory freed.
  
  In C#, a destructor method is called if one exists in the class of the object.

* ### *Garbage collection?*
  Yes, both C# and Java have a garbage collector that handles the memory.
  
  Garbage collection looks at heap memory, finding which objects are being used and which are not, then deleting the unused ones.
  
  This helps development because it removes manual memory management from our list of problems that we have to address during coding.
  
  However, a disadvantage of garbage collection is that it can affect the performance of the software.

* ### *Automatic reference counting?*
  Neither C# or Java use automatic reference counting and instead use garbage collection.
  
  The advantages of this are that entire object graphs and retain cycles can be cleaned up all at once.
  
  Also, garbage collection happens in the background, so less work is done overall.
  
  One disadvantage includes not knowing exactly when an object is released.
  
  Another disadvantage is that when garbage collection happens, all threads must wait for it to finish.

---
[Home](../README.md)
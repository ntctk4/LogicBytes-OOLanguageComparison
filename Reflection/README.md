# Reflection

Java and C# have similar reflection capabilities.  First, you can find out the class of an object.  With the Class/Type (Java/C# respectively) in hand, you can then find all the information about it: Fields, Methods, Constructors.  Neither Java nor C# reveal private members through reflection.

Reflection is used to gain information about types at runtime:
* Oracle: "Reflection is commonly used by programs which require the ability to examine or modify the runtime behavior of applications running in the Java virtual machine."
* MSDN: "[Reflection] enables you to obtain information about loaded assemblies and the types defined within them, such as classes, interfaces, and value types. You can also use reflection to create type instances at run time, and to invoke and access them."

## Java
* [The Reflection API](https://docs.oracle.com/javase/tutorial/reflect/)
* Example Output: (Note: There is a private field on MyClass called privateFloat that is not showing in the list of fields)
```
simple name: MyClass
canonical name: classes.MyClass
-----------------------------------------
MyClass field: myType is classes.MyType
MyClass field: speed is int
-----------------------------------------
MyClass field: public classes.MyType classes.MyClass.myType
MyClass field: public int classes.MyClass.speed
-----------------------------------------
java.lang.Object
-----------------------------------------
MyClass method: public float classes.MyClass.getPrivateFloat()
MyClass method: public void classes.MyClass.changeSpeed(int)
MyClass method: public final void java.lang.Object.wait(long,int)
MyClass method: public final native void java.lang.Object.wait(long)
MyClass method: public final void java.lang.Object.wait()
MyClass method: public boolean java.lang.Object.equals(java.lang.Object)
MyClass method: public java.lang.String java.lang.Object.toString()
MyClass method: public native int java.lang.Object.hashCode()
MyClass method: public final native java.lang.Class<?> java.lang.Object.getClass()
MyClass method: public final native void java.lang.Object.notify()
MyClass method: public final native void java.lang.Object.notifyAll()
-----------------------------------------
MyClass constructor: public classes.MyClass(classes.MyType,int)
-----------------------------------------
No MyClass() constructor
-----------------------------------------
MyClass package: classes
```
## C#
* [External Link: Reflection in the .NET Framework](https://msdn.microsoft.com/en-us/library/f7ykdhsy.aspx)
* [External Link: Reflection (C#)](https://msdn.microsoft.com/en-us/library/f7ykdhsy.aspx)
* Other Abilities
    * EventInfo
    * PropertyInfo
    * ParameterInfo
* Example Output: (Note: There is a private field in MyClass called myPrivateField that is not showing in the list of fields)
```
Type: CSharpReflection.MyClass
----------------------------------------------------------
MyClass Constructor: Void .ctor()
MyClass Constructor: Void .ctor(Int32, Double, Boolean)
----------------------------------------------------------
MyClass Method: Int32 squareSomeNum()
MyClass Method: Boolean someOtherFunction(Int32)
MyClass Method: System.String ToString()
MyClass Method: Boolean Equals(System.Object)
MyClass Method: Int32 GetHashCode()
MyClass Method: System.Type GetType()
----------------------------------------------------------
MyClass Field: someNum is a System.Int32
MyClass Field: someOtherNum is a System.Double
MyClass Field: someOtherVariable is a System.Boolean
----------------------------------------------------------
```
[Home](../README.md)

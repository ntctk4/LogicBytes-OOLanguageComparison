# Singleton

## Java
* Implementation: [External Link: Singleton Design Pattern in Java](https://sourcemaking.com/design_patterns/singleton/java/1)
  * This Java Singleton is inherently thread-safe and is lazily instantiated only when getInstance() is first called.

```java
public class Singleton {
    private Singleton() {
      System.out.println("Inside Singleton Private Constructor");
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        System.out.println("Returning: SingletonHolder.INSTANCE");
        return SingletonHolder.INSTANCE;
    }
}
```
  * Output:
  
        From Main: Requesting Singleton ( Singleton.getInstance() )
        Returning: SingletonHolder.INSTANCE
        Inside Singleton Private Constructor
        From Main: Requesting Singleton Again
        Returning: SingletonHolder.INSTANCE

## C#
* Implementation: [External Link: MSDN Implementing Singleton in C#](https://msdn.microsoft.com/en-us/library/ff650316.aspx)
  * Basic: This is lazily instantiated as well, however it is not thread-safe.  
```csharp  
public class Singleton1 {
  private static Singleton1 instance;

  private Singleton1() {
    Console.WriteLine("Inside Singleton1 private Constructor: Calling Thread.Sleep(2000)");
    Thread.Sleep(2000);
  }

  public static Singleton1 Instance {
    get {
      if (instance == null) {
        Console.WriteLine("instance == null");
        instance = new Singleton();
      }
      return instance;
    }
  }
}
```
  * Output: Two "Singletons" created because second thread attempted access before first thread returned from constructor
  
        Thread Thread1: Requesting Singleton1
        Thread Thread2: Requesting Singleton1
        instance == null
        instance == null
        Inside Singleton1 private constructor: Calling Thread.Sleep(2000)
        Inside Singleton1 private constructor: Calling Thread.Sleep(2000)

  * The solution to thread-safety is to use static initialization:
```csharp
public sealed class Singleton2 {
  private static readonly Singleton instance = new Singleton();

  private Singleton2(){ Console.WriteLine("Creating Singleton2"); }

  public static Singleton2 Instance { get { return instance; } }
}
```
  * Output: Appears to be lazy, but isn't necessarily so.
  
        Thread Thread3: Requesting Singleton2
        Creating Singleton2
        Thread Thread4: Requesting Singleton2

  * The method to ensure thread-safety and lazy instantiation involves using an object mutext to lock instance creation to the first thread that accesses it (MSDN asserts, however, that in most cases static initialization is sufficient):
```csharp
public sealed class Singleton {

  private static volatile Singleton instance;
  private static object syncRoot = new Object();

  private Singleton() {}

  public static Singleton Instance {
    get {
      if (instance == null) {
        lock (syncRoot) {
          if (instance == null) 
            instance = new Singleton();
        }
      }

      return instance;
    }
  }
}
```
[Home](../README.md)

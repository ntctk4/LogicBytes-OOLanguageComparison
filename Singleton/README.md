# Singleton
* How is a singleton implemented?
* Can it be made thread-safe?
* Can the singleton instance be lazily instantiated?

## Java
* Implementation: [External Link: Singleton Design Pattern in Java](https://sourcemaking.com/design_patterns/singleton/java/1)
  * This Java Singleton is inherently thread-safe and is lazily instantiated only when getInstance() is first called.

        public class Singleton {
          private Singleton() {}

          private static class SingletonHolder {
              private static final Singleton INSTANCE = new Singleton();
          }

          public static Singleton getInstance() {
              return SingletonHolder.INSTANCE;
          }
        }

## C#
* Implementation: [External Link: MSDN Implementing Singleton in C#](https://msdn.microsoft.com/en-us/library/ff650316.aspx)
  * Basic: This is lazily instantiated as well, however it is not thread-safe.  
  
        public class Singleton {
          private static Singleton instance;

          private Singleton() {}

          public static Singleton Instance {
            get {
              if (instance == null) {
                instance = new Singleton();
              }
              return instance;
            }
          }
        }

  * The solution to thread-safety is to ignore lazy instantiation use static initialization to create the Intance:
      
        public sealed class Singleton {
          private static readonly Singleton instance = new Singleton();

          private Singleton(){}

          public static Singleton Instance {
            get {
              return instance; 
            }
          }
        }

  * The method to ensure thread-safety and also use lazy instantiation involves locking the instance creation to the first thread that accesses it (MSDN asserts, however, that in most cases static initialization is sufficient):
  
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

[Home](../README.md)

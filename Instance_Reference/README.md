# Instance Reference Name in Data Type (class)

## Both Java and C#
* An object can reference itself witht the keyword 'this'

      public Class MyClass {
          int someInt;
          
          // Constructor Parameter has same name as member
          public MyClass(int someInt) {
              // use 'this' to reference current object and differentiate between two someInts
              this.someInt = someInt
          }
      }

[Home](../README.md)

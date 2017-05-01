using System;

namespace inheritance
{
    interface MyInterface1{}

    interface MyInterface2 : MyInterface1
    {
        void Method1();
    }

    abstract class MyParentClass
    {
        abstract public void Method2();

        public void Method3()
        {
            Console.WriteLine("method3");
        }
    }

    class MyClass : MyParentClass, MyInterface2
    {
        public void Method1()
        {
            Console.WriteLine("method1");
        }

        public override void Method2()
        {
            Console.WriteLine("method2");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            MyClass thing = new MyClass();
            thing.Method1();
            thing.Method2();
            thing.Method3();
        }
    }
}
using System;

namespace inheritance
{
    interface MyInterface
    {
        void method1();
    }

    abstract class MyParentClass
    {
        abstract public void method2();

        public void method3()
        {
            Console.WriteLine("method3");
        }
    }

    class MyClass : MyParentClass, MyInterface
    {
        public void method1()
        {
            Console.WriteLine("method1");
        }

        public override void method2()
        {
            Console.WriteLine("method2");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            MyClass thing = new MyClass();
            thing.method1();
            thing.method2();
            thing.method3();
        }
    }
}
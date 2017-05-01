using stuff1;
using System;

namespace stuff2
{
    class Program
    {
        static void Main(string[] args)
        {
            MyClass thing = new MyClass();
            thing.Method();
        }
    }

    namespace stuff3
    {
        //namespaces can be inside each other.
    }
}

namespace stuff1
{
    public class MyClass
    {
        //this can be internal to be accessed by main, which is in another namespace.
        internal void Method()
        {
            Console.WriteLine("The stuff1 namespace is being used to call this method!");
        }
    }
}
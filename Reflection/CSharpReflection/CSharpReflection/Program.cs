using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;

namespace CSharpReflection
{
    class Program
    {
        static void Main(string[] args)
        {
            MyClass mc = new MyClass();
            Type mcType = mc.GetType();
            Console.WriteLine("Type: " + mcType.ToString());

            Console.WriteLine("----------------------------------------------------------");

            ConstructorInfo[] constructorInfo = mcType.GetConstructors();
            foreach (var cinfo in constructorInfo)
            {
                Console.WriteLine("MyClass Constructor: " + cinfo.ToString());
            }

            Console.WriteLine("----------------------------------------------------------");

            MethodInfo[] methodInfo = mcType.GetMethods();
            foreach (var minfo in methodInfo)
            {
                Console.WriteLine("MyClass Method: " + minfo.ToString());
            }

            Console.WriteLine("----------------------------------------------------------");

            FieldInfo[] fieldInfo = mcType.GetFields();
            foreach (var finfo in fieldInfo)
            {
                Console.WriteLine("MyClass Field: " + finfo.Name + " is a " + finfo.FieldType);
            }

            Console.WriteLine("----------------------------------------------------------");
        }
    }
}

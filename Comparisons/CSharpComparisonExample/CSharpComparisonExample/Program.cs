using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpComparisonExample
{
    class Program
    {
        static void Main(string[] args)
        {
            //referance equality: .ReferenceEquals()
            String x = "Apple";
            String y = x;
            String z = "Apple";
            object a = new object();
            object b = a;
            object c = new object();
            //checks to see if same instance
            if (System.Object.ReferenceEquals(a, b))
            {
                Console.Write("a equals b using ReferenceEquals\n");
            }
            else
                Console.Write("a is not b using RefereneEquals\n");

            if (System.Object.ReferenceEquals(a, c))
            {
                Console.Write("a equals c using ReferenceEquals\n");
            }
            else
                Console.Write("a is not c using ReferenceEquals\n");

            //checks to see if same instance as well
            if (a == b)
                Console.WriteLine("a equals b using ==");
            else
                Console.WriteLine("a is not equal to b using ==");

            if (a == c)
                Console.WriteLine("a equals c using ==");
            else
                Console.WriteLine("a is not equal to c using ==");

            //checks to see if same value
            if (x.Equals(y))
                Console.WriteLine("x equals y using Equals()");
            else
                Console.WriteLine("x is not y using Equals()");

            if (x.Equals(z))
                Console.WriteLine("x equals z using Equals()");
            else
                Console.WriteLine("x is not z using Equals()");
            //http://stackoverflow.com/questions/3869601/c-sharp-equals-referenceequals-and-operator

        }
    }
}

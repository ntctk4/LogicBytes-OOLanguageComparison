using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace procedural_Csharp
{
    class Program
    {
        /**
         * this example uses subrotines which is methods/fucntions... and demenstrates very basci concepnts of procedural programming...
         * */
        static void Main(string[] args)
        {
            int i = 4, j = 3;
            print(i, j);
        }

        static int add (int i, int j)
        {
            return i + j;
        }
        static float subtract( int i, int j) // out reference parameters
        {
            return i-j;
        }
        static float multiply(int i, int j) // out reference parameters
        {
            return i*j;
        }
        static void print(int i, int j) // value parameters
        {
            Console.WriteLine("i= {0}, j={1}, adding them gives us {2}", i, j, add(i,j));
            Console.WriteLine("i= {0}, j={1}, dividing them gives us {2}", i, j, subtract(i, j));
            Console.WriteLine("i= {0}, j={1}, multiplying them gives us {2}", i, j, multiply(i, j));
        }
    }
}



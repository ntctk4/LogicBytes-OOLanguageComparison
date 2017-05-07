using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exception_cSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 3;
            int b = 0;
            float restult;

            try
            {
                restult = a / b;
            }
            catch (ArithmeticException e) //this is specific so it will take place
            {
                Console.WriteLine("can not divide by zero dummy!");
            }
            catch (Exception f)
            {
                Console.WriteLine("Exception occured");
            }
            finally
            {
                Console.WriteLine("this will take place whether an exception occured or not!");
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace null_Csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            String nothing = null;
            String word = "Cat";
            String emtpy = "";

            if (nothing == null) 
            {
                Console.WriteLine("nothing is null");
            }
            else if (word == null)
            {
                Console.WriteLine("word is null");
            }
            else if (emtpy == null)
            {
                Console.WriteLine("word is null");
            }

        }
    }
}

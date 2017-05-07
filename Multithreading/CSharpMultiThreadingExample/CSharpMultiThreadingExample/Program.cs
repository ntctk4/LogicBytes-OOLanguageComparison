using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace CSharpMultiThreadingExample
{
    class Program
    {
        static String[] names = { "Nathan", "Scott", "Luke", "Reem" };
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(new ThreadStart(PrintNumbers));
            thread1.Start();
            Thread thread2 = new Thread(new ThreadStart(PrintNames));
            thread2.Start();
            thread1.Join();
            thread2.Join();
            Console.Write("thread work is done \n");
        }

        public static void PrintNumbers()
        {
            Random rand = new Random();
            int num = 0;
            for (int i = 0; i < 300; i++)
            {
                num = rand.Next(0, 500);
                Console.Write(num + "\n");
            }
        }

        public static void PrintNames()
        {
            Random rand = new Random();
            int num = 0;
            for(int i =0; i < 300; i++)
            {
                num = rand.Next(0, 4);
                Console.Write(names[num] + "\n");
            }
        }
    }
}

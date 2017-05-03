using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Diagnostics;

namespace CSSingleton
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(CreateSingleton1);
            thread1.Name = "Thread1";
            Thread thread2 = new Thread(CreateSingleton1);
            thread2.Name = "Thread2";

            thread1.Start();
            thread2.Start();

            thread1.Join();
            thread2.Join();

            Thread thread3 = new Thread(CreateSingleton2);
            thread3.Name = "Thread3";
            Thread thread4 = new Thread(CreateSingleton2);
            thread4.Name = "Thread4";

            thread3.Start();
            thread4.Start();

        }

        private static void CreateSingleton1()
        {
            Console.WriteLine("Thread " + Thread.CurrentThread.Name + ": Requesting Singleton1");
            Singleton1 single1 = Singleton1.Instance;
        }

        private static void CreateSingleton2()
        {
            Console.WriteLine("Thread " + Thread.CurrentThread.Name + ": Requesting Singleton2");
            Singleton2 single2 = Singleton2.Instance;
        }
    }
}

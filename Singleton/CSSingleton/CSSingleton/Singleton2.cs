using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Diagnostics;

namespace CSSingleton
{
    class Singleton2
    {
        private static readonly Singleton2 instance = new Singleton2();

        private Singleton2() { Console.WriteLine("Creating Singleton2");Thread.Sleep(2000); }

        public static Singleton2 Instance { get { return instance; } }
    }
}

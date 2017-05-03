using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace CSSingleton
{
    class Singleton1 {
        private static Singleton1 instance;

        private Singleton1() {
            Console.WriteLine("Inside Singleton1 private constructor: Calling Thread.Sleep(2000)");
            Thread.Sleep(2000);
        }

        public static Singleton1 Instance {
            get {
                if (instance == null) {
                    Console.WriteLine("instance == null");
                    instance = new Singleton1();
                }
                return instance;
            }
        }
    }
}

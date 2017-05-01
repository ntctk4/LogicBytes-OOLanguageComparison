using System;

namespace types
{
    interface MyInterface
    {
        void Method();
    }

    class MyClass : MyInterface
    {
    public void Method()
    {
        Console.WriteLine("It Works!");
    }
    }

class Program
    {
        static void Main(string[] args)
        {
            //value types
            bool valType1 = true;
            byte valType2 = 127;
            char valType3 = 'a';
            double valType4 = 3.14159265359;
            float valType5 = 3.14f;
            int valType6 = 42;
            long valType7 = 999999999;
            short valType8 = 9999;

            ValueMethod(valType1, valType2, valType3, valType4, valType5, valType6, valType7, valType8);
            Console.WriteLine(valType1);
            Console.WriteLine(valType2);
            Console.WriteLine(valType3);
            Console.WriteLine(valType4);
            Console.WriteLine(valType5);
            Console.WriteLine(valType6);
            Console.WriteLine(valType7);
            Console.WriteLine(valType8);

            //reference types
            int[] array = new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            MyInterface myInterface = null;
            Object thing = new Object();
            String word = "cat";

            ReferenceMethod(array, ref myInterface, ref thing, ref word);
            Console.WriteLine("\n[" + string.Join(", ", array) + "]");
            if(myInterface == null)
            {
                Console.WriteLine("It doesn't work: null");
            }
            else
            {
                myInterface.Method();
            }
            if(thing == null)
            {
                Console.WriteLine("null");
            }
            else
            {
                Console.WriteLine(thing);
            }
            Console.WriteLine(word + "\n");
        }

        private static void ValueMethod(bool valType1, byte valType2, char valType3, double valType4, float valType5, int valType6, long valType7, short valType8)
        {
            valType1 = false;
            valType2 = 15;
            valType3 = 'z';
            valType4 = 1.61803398875;
            valType5 = 1.618f;
            valType6 = 1337;
            valType7 = -1000000000;
            valType8 = -666;
        }

        private static void ReferenceMethod(int[] array, ref MyInterface myInterface, ref Object thing, ref String word)
        {
            int j = 10;
            for (int i = 0; i < array.Length; i++)
            {
                array[i] = j;
                j--;
            }
            myInterface = new MyClass();
            thing = null;
            word = "dog";
        }
    }
}
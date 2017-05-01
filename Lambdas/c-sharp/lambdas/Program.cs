using System;
using System.Collections.Generic;

namespace lambdas
{
    //a delegate
    delegate void PrintName(string f, string l);

    class Program
    {
        //method1 for delegate
        static void Normal(string f, string l)
        {
            Console.WriteLine(f + " " + l);
        }

        //method2 for delegate
        static void Reversed(string f, string l)
        {
            Console.WriteLine(l + ", " + f);
        }

        static void Main(string[] args)
        {
            List<Person> people = new List<Person>();
            Person person1 = new Person("Reem", "Alharbi", 22);
            Person person2 = new Person("Nathan", "Callahan", 24);
            Person person3 = new Person("Luke", "Moss", 28);
            Person person4 = new Person("Scott", "Strothmann", 31);
            people.Add(person1);
            people.Add(person2);
            people.Add(person3);
            people.Add(person4);

            //create delegate instances and pass them to function
            PrintName pnf = new PrintName(Normal);
            PrintName pnr = new PrintName(Reversed);
            person3.DisplayNameBothWays(pnf, pnr);
            Console.WriteLine("");

            //lamdba expressions (functional operations)
            people.Sort((p1, p2) => p1.age.CompareTo(p2.age));
            people.ForEach(p => Console.WriteLine(p.first));
        }
    }

    class Person
    {
        public int age { get; }
        public string first { get; }
        public string last { get; }

        public Person(string first, string last, int age)
        {
            this.first = first;
            this.last = last;
            this.age = age;
        }

        public void DisplayNameBothWays(PrintName pnf, PrintName pnr)
        {
            pnf(first, last);
            pnr(first, last);
        }
    }
}
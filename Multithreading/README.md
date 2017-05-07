# Multithreading
* Threads or thread-like abilities
	Both Java and C# use threads when multithreading.
* How is multitasking accomplished?
	## Java
    
	* In Java, threads can be created in two diffrent ways. The first way is to extend the Thread class. The class that extends thread must override the run() method with code that the developer want the thread to do. Then just create an object of that class and call the start() method.
    
    * The second way to create a thread in java is to create a class that implements the Runnable interface, and pass that object into a thread. This way a developer must override the run() method with code that they want the thread to do. The developer must then create a thread and pass an object implementing the runnable interface in the threads constructor, then call start() on the thread.

```java
	public class ThreadExample extends Thread{
    String name;
    Boolean running = true;
    
    ThreadExample(String name)
    {
        this.name = name;
    }
    
    @Override
    public void run() {
        while(running)
            System.out.println(name + " is running");
        System.out.println(name + " is done");
    }
    
}
```

```java
public class RunnableExample implements Runnable{
    String name;
    Boolean running = true;
    
    RunnableExample(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        while(running)
            System.out.println(name + " is running");
        System.out.println(name + " is done");
    }
    
    public void start()
    {
        Thread thread = new Thread(this, name);
        thread.start();
    }
    
}

```


## C#

	* In C# it is much easier to create threads. An instance of a thread must be created with a delegate with the method to be ran in the thread's constructor. Once the developer is ready to run the thread, they only need to call the start() method on the instance of the thread.

```csharp
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

```
[Home](../README.md)

package inheritance;

interface MyInterface
{
    void method1();
}

abstract class MyParentClass
{
    abstract public void method2();

    public void method3()
    {
        System.out.println("method3");
    }
}

class MyClass extends MyParentClass implements MyInterface
{
    @Override
    public void method1()
    {
        System.out.println("method1");
    }
    @Override
    public void method2()
    {
        System.out.println("method2");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        MyClass thing = new MyClass();
        thing.method1();
        thing.method2();
        thing.method3();
    }
}
package types;
import java.util.Arrays;

interface MyInterface
{
    void method();
}

class MyClass implements MyInterface
{
    @Override
    public void method(){
        System.out.println("It Works!");
    }
}

public class Types 
{
    public static void main(String[] args)
    {
        //value types
        boolean valType1 = true;
        byte valType2 = 127;
        char valType3 = 'a';
        double valType4 = 3.14159265359;
        float valType5 = 3.14f;
        int valType6 = 42;
        long valType7 = 999999999;
        short valType8 = 9999;
        
        valueMethod(valType1, valType2, valType3, valType4, valType5, valType6, valType7, valType8);
        System.out.println(valType1);
        System.out.println(valType2);
        System.out.println(valType3);
        System.out.println(valType4);
        System.out.println(valType5);
        System.out.println(valType6);
        System.out.println(valType7);
        System.out.println(valType8);
        
        //reference types
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        MyInterface myInterface = null;
        Object thing = new Object();
        String word = "cat";
        
        referenceMethod(array, myInterface, thing, word);
        System.out.println("\n" + Arrays.toString(array));
        if(myInterface == null)
        {
            System.out.println("It doesn't work: null");
        }
        else
        {
            myInterface.method();
        }
        if(thing == null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(thing);
        }
        System.out.println(word + "\n");
    }
    
    private static void valueMethod(boolean valType1, byte valType2, char valType3, double valType4, float valType5, int valType6, long valType7, short valType8)
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
    
    private static void referenceMethod(int[] array, MyInterface myInterface, Object thing, String word)
    {
        int j = 10;
        for(int i=0; i<array.length; i++){
            array[i] = j;
            j--;
        }
        myInterface = new MyClass();
        thing = null;
        word = "dog";
    }
}
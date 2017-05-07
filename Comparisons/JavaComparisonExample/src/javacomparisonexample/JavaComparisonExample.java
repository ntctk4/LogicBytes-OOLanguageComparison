/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomparisonexample;

/**
 *
 * @author ntctk4
 */
public class JavaComparisonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //all primitives are value types
        int x = 5;
        int y = 5;
        String a = new String("Apple");
        String b = a;
        String c = new String("Apple");
        
        //== checks to see if both sides are the same thing
        //.equals() compares both values to check if they are equal
        
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        //== compares the two object references to see if they are pointing to
        //the same instance, not is the string value is the same
        //should be equal
        if(a == b)
            System.out.println("a and b are equal using ==");
        else
            System.out.println("a and b are not equal using ==");
        //should not be equal
        if(a == c)
            System.out.println("a and c are equal using ==");
        else
            System.out.println("a and c are not equal using ==");
        
        //The .equals() method actually compares the values inside
        //the instances (wether or not the references point to the same thing)
        //should be equal
        if(a.equals(b))
            System.out.println("a and b are equal using the equals method");
        else
            System.out.println("a and b are not equal using the equals method");
        //should be equal
        if(a.equals(c))
            System.out.println("a and c are equal using the equals method");
        else
            System.out.println("a and c are not equal using the equals method");
        
    }
}

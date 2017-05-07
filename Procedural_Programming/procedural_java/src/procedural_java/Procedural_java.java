/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedural_java;

/**
 *
 * @author Reem Alharbi
 */
public class Procedural_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            int i = 4, j = 3;
            print(i, j);
        }

        static int add (int i, int j)
        {
            return i + j;
        }
        static float subtract( int i, int j) // out reference parameters
        {
            return i-j;
        }
        static float multiply(int i, int j) // out reference parameters
        {
            return i*j;
        }
        static void print(int i, int j) // value parameters
        {
           System.out.printf("i= %d, j=%d, adding them gives us %d\n", i, j, add(i,j));
           System.out.printf("i= %d, j=%d, dividing them gives us %.1f\n", i, j, subtract(i, j));
           System.out.printf("i= %d, j=%d, multiplying them gives us %.1f\n", i, j, multiply(i, j));
        }
}

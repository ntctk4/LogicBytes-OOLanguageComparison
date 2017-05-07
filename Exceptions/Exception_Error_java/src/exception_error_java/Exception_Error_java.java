/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_error_java;

/**
 *
 * @author Reem Alharbi
 */
public class Exception_Error_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     
        int a = 3;
        int b = 0;
        float restult;
        
        try
        {
           restult = a/b; 
        }
        catch (ArithmeticException e) //this is specific so it will take place
        {
            System.out.println("can not divide by zero dummy!");
        }
        catch (Exception f)
        {
            System.out.println("Exception occured");
        }
        finally
        {
            System.out.println("this will take place whether an exception occured or not!");
        }
        
    }
    
}

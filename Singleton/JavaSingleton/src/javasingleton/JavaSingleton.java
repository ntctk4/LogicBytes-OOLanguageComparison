/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;

/**
 *
 * @author Scott
 */
public class JavaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("From Main: Requesting Singleton ( Singleton.getInstance() )");
        Singleton single = Singleton.getInstance();
        System.out.println("From Main: Requesting Singleton Again");
        Singleton single1 = Singleton.getInstance();
    }
    
}

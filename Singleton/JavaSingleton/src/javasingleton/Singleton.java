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
public class Singleton {
    
    private Singleton() {
        System.out.println("Inside Singleton Private Constructor");
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        System.out.println("Returning: SingletonHolder.INSTANCE");
        return SingletonHolder.INSTANCE;
    }
}

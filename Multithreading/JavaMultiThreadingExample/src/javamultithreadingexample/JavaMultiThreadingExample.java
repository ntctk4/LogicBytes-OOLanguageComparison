/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreadingexample;

/**
 *
 * @author ntctk4
 */
public class JavaMultiThreadingExample {

    //two main ways to create a thread in java:
    //1 use the Runnable Interface
    //2 Extend the thread Class
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        RunnableExample thread1 = new RunnableExample("thread1");
        thread1.start();
        
        RunnableExample thread2 = new RunnableExample("thread2");
        thread2.start();
        
        ThreadExample thread3 = new ThreadExample("thread3");
        thread3.start();
        
        ThreadExample thread4 = new ThreadExample("thread4");
        thread4.start();
        
        Thread.sleep(500);
        thread1.running = false;
        thread2.running = false;
        thread3.running = false;
        thread4.running = false;
    }

   
    
}


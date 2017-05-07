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

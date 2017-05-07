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

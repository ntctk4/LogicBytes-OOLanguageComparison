/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Scott
 */
public class MyClass {
    public MyType myType;
    public int speed;
    private float privateFloat;
    
    public MyClass(MyType myType, int speed) {
        this.myType = myType;
        this.speed = speed;
    }
    
    public float getPrivateFloat() {
        return privateFloat;
    }
    
    public void changeSpeed(int speed) {
        this.speed = speed;
    }
}

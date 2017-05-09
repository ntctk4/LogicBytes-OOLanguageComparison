/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_java;

/**
 *
 * @author Reem Alharbi
 */
public class Interface_java implements Engine {

    String modelSetting = "";
    int powerSetting = 0;
    
    public void model(String newModel)
    {
        modelSetting = newModel;
    }
    public void power(int newPower)
    {
        powerSetting = newPower;   
    }
    
    public void printing()
    {
        System.out.printf("The model has been set to %s and the power is %d\n", modelSetting, powerSetting);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Interface_java object = new Interface_java();
      object.model("ABC Model");
      object.power(4000);
      object.printing();  
    }
    
}

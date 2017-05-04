/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareflection;

import classes.MyClass;
import classes.MyType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Scott
 */
public class JavaReflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass mc = new MyClass(MyType.AIRPLANE, 100);
        
        Class myClass = mc.getClass();
        
        String simpleName = myClass.getSimpleName();
        System.out.println("simple name: " + simpleName);
        
        String canonicalName = myClass.getCanonicalName();
        System.out.println("canonical name: " + canonicalName);
        
        Field[] myFields = myClass.getFields();
        System.out.println("-----------------------------------------");
        for (Field myField : myFields) {
            System.out.println("MyClass field: " + myField.getName() + " is " 
                    + myField.getType().getCanonicalName());
        }
        System.out.println("-----------------------------------------");
        for (Field myField : myFields) {
            System.out.println("MyClass field: " + myField.toGenericString());
        }
        System.out.println("-----------------------------------------");
        
        Class mySuperclass = myClass.getClass().getSuperclass();
        System.out.println(mySuperclass.getTypeName());
        
        System.out.println("-----------------------------------------");
        
        Method[] myMethods = myClass.getMethods();
        
        for (Method myMethod : myMethods) {
            System.out.println("MyClass method: " + myMethod.getName() 
                    + " return is " + myMethod.getGenericReturnType());
        }
        
        System.out.println("-----------------------------------------");
        
        for (Method myMethod : myMethods) {
            System.out.println("MyClass method: " + myMethod.toGenericString());
        }
        
        System.out.println("-----------------------------------------");
        
        Constructor myConstructor;
        try {
            myConstructor = mc.getClass()
                    .getConstructor(MyType.class, int.class);
            System.out.println("MyClass constructor: " 
                    + myConstructor.toGenericString());
        } catch (NoSuchMethodException | SecurityException ex) {
            System.out.println("No MyClass(MyType, int) constructor");
        }
        
        System.out.println("-----------------------------------------");
        
        try {
            myConstructor = mc.getClass().getConstructor();
            System.out.println("MyClass constructor: " 
                    + myConstructor.toGenericString());
        } catch (NoSuchMethodException | SecurityException ex) {
            System.out.println("No MyClass() constructor");
        }
        
        System.out.println("-----------------------------------------");
        
        Package myPackage = mc.getClass().getPackage();
        System.out.println("MyClass package: " + myPackage.getName());
    }
    
}

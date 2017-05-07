/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalistenerexample;

import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ntctk4
 */
public class JavaListenerExample extends Application {
    int i = 0;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("This button increments i");
        //uses an anonymous inner class to to the action when the event happens
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This Button has been pushed " + i + " times");
                btn.setText("i is " + i);
                i++;
            }
        });
        
        //the btn object now listens for when the mouse hovers over
        //the button. When it does, the anonymous class handles the event
        //and prints out a message
        btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("The Mouse has entered the button's space!");
            }
            
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Event Listener Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoCampoTextoBoton;

import CampoTextoBoton.CampoTextoBoton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class usandoMiCampoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        StackPane root = new StackPane();
        
        CampoTextoBoton campoTextoBoton = new CampoTextoBoton();
        campoTextoBoton.setText("Hello!");
        
        root.getChildren().add(campoTextoBoton);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Usando mi control - CampoTextoBoton");
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

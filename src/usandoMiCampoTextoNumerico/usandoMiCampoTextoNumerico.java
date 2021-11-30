/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoMiCampoTextoNumerico;

import CampoTextoNumerico.CampoTextoNumerico;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class usandoMiCampoTextoNumerico extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 300, 250);
        
        CampoTextoNumerico campoTextoNumerico = new CampoTextoNumerico();
        primaryStage.setTitle("Hello World!");
        root.getChildren().add(campoTextoNumerico);
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

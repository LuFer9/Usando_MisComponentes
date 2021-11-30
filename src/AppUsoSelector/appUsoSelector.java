/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppUsoSelector;

import SelectorDeslizamiento.SelectorDeslizamineto;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class appUsoSelector extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();
        
        Label lb = new Label();
        
        SelectorDeslizamineto selectorDeslizamineto1 = new SelectorDeslizamineto(); 
        SelectorDeslizamineto selectorDeslizamineto2 = new SelectorDeslizamineto();
        
        
        root.getChildren().add(selectorDeslizamineto1);
        root.getChildren().add(selectorDeslizamineto2);
        root.getChildren().add(lb);
        
        selectorDeslizamineto1.setOnAction((new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                lb.setText("Pulsado el lb de arriba");
            }
            
            
        }));
        
         selectorDeslizamineto2.setOnAction((new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                lb.setText("Pulsado el lb de abajo");
            }
            
            
        }));
        
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

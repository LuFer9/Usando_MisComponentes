/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppUsoTextoBoton;

import CampoTextoBoton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class UsandoMiTextoBoton implements Initializable {

    @FXML
    private CampoTextoBoton campoTextoBotonSuperior;
    @FXML
    private CampoTextoBoton campoTextoBotonInferior;
    @FXML
    private Label labelInfo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
    }    

    @FXML
    private void OnActionBotonSuperior(ActionEvent event) {
        
        labelInfo.setText("Grabado -> " + campoTextoBotonSuperior.getText());
    }

    @FXML
    private void OnActionBotonInferior(ActionEvent event) {
        labelInfo.setText("Grabado -> " + campoTextoBotonInferior.getText());
    }




    
}

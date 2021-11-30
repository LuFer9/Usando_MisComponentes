/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoMiTemporizador;

import Temporizador.Temporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class MiTemporizador implements Initializable {

    @FXML
    private Temporizador temporizador;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        temporizador.setTiempo(20);
        label.setText("Hola en " + temporizador.getTiempo() + " segundos voy a cambiar..");
        
    }    

    @FXML
    private void onAction(ActionEvent event) {
        
        label.setText("Texto Cambiado...");
    }
       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flechettes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author nicoc
 */
public class MainController implements Initializable {
    
    @FXML
    private ImageView cible;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cible.setImage(new Image(getClass().getResource("/images/cible.png").toString()));
        
    }    
    
}

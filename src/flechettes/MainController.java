/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flechettes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author nicoc
 */
public class MainController implements Initializable {
    
    
    @FXML
    private ChoiceBox choiceBoxGameType;
    
    private final IntegerProperty gameType = new SimpleIntegerProperty();
        public int getGameType() {return gameType.get();}
        public void setGameType(int value) {gameType.set(value);}
        public IntegerProperty gameTypeProperty() {return gameType;}
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        initComboGameType();
        
    }    
    
    

    private void initComboGameType() {
        choiceBoxGameType.getItems().addAll(301,501);
        choiceBoxGameType.setValue(choiceBoxGameType.getItems().get(0));
        setGameType((int)choiceBoxGameType.getValue());
        
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flechettes;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author nicoc
 */
public class Joueur {
    private final StringProperty Nom = new SimpleStringProperty();
        public String getNom() {return Nom.get();}
        public void setNom(String value) {Nom.set(value);}
        public StringProperty nomProperty() {return Nom;}    
    
    private final IntegerProperty Score = new SimpleIntegerProperty();
        public int getScore() {return Score.get();}
        public void setScore(int value) {Score.set(value);}
        public IntegerProperty scoreProperty() {return Score;}
        
    private final IntegerProperty Lancer1 = new SimpleIntegerProperty();
        public int getLancer1() {return Lancer1.get();}
        public void setLancer1(int value) {Lancer1.set(value);}
        public IntegerProperty Lancer1Property() {return Lancer1;}
        
    private final IntegerProperty Lancer2 = new SimpleIntegerProperty();
        public int getLancer2() {return Lancer2.get();}
        public void setLancer2(int value) {Lancer2.set(value);}
        public IntegerProperty Lancer2Property() {return Lancer2;}
        
    private final IntegerProperty Lancer3 = new SimpleIntegerProperty();
        public int getLancer3() {return Lancer3.get();}
        public void setLancer3(int value) {Lancer3.set(value);}
        public IntegerProperty Lancer3Property() {return Lancer3;}
        
        
        
    
        
        
        
        
        
    
    
    
}

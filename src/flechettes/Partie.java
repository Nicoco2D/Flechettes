/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flechettes;

import java.util.ArrayList;

/**
 *
 * @author nicoc
 */
public class Partie {
    private ArrayList<Joueur> joueurs = new ArrayList<>();

    private Joueur currentPlayer;
    
    public Partie() {
        
    }
    
    public void create(int nbJoueurs,Joueur ...joueur){
        for(int i=0;i<nbJoueurs;i++){
            joueurs.add(joueur[i]);
        }
        currentPlayer = joueurs.get(0);
    }

    @Override
    public String toString() {
        return "Partie{" + "joueurs=" + joueurs.toString() + '}';
    }

    void nextPlayer() {
        currentPlayer = joueurs.get(joueurs.indexOf(currentPlayer)+1%joueurs.size());
    }
        
     
    
    
    
}

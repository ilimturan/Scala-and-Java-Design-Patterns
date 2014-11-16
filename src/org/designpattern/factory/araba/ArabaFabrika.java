/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.factory.araba;

import java.util.ArrayList;

/**
 *
 * @author ilimturan
 */
public abstract class ArabaFabrika {
    
    private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();
    
    
    public ArabaFabrika(){
        this.createAuto();
    }
    
    public abstract void createAuto();

    public ArrayList<Araba> getArabaListesi() {
        return arabaListesi;
    }

    public void setArabaListesi(ArrayList<Araba> arabaListesi) {
        this.arabaListesi = arabaListesi;
    }
    
    
    
    
}

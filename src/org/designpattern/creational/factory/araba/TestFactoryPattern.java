/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.factory.araba;

/**
 *
 * @author ilimturan
 */
public class TestFactoryPattern {
    
    
    public static void main (String[] args) {
        ArabaFabrika bmvFabrika = new BmvFabrika();
        ArabaFabrika audioFabrika = new AudioFabrika();
        
        //üretilen bmvleri göster
        for (Araba araba : bmvFabrika.getArabaListesi()) {
            System.out.println(
                    "Marka: " + araba.getMarka() + " - " +
                    "Model: " + araba.getModel()+ " - " +
                    "Beygir: " + araba.getBeygirGucu() + " - "
            );
        }
        
        //üretilen audio leri göster
        for (Araba araba : audioFabrika.getArabaListesi()) {
            System.out.println(
                    "Marka: " + araba.getMarka() + " - " +
                    "Model: " + araba.getModel()+ " - " +
                    "Beygir: " + araba.getBeygirGucu() + " - "
            );
        }
        
    }
}

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
public class BmvFabrika extends ArabaFabrika {

    @Override
    public void createAuto() {
        getArabaListesi().add(new BmvZ4(190));
    }
    
}

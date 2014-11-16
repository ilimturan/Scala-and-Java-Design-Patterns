/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.factory.java.car;

/**
 *
 * @author ilimturan
 */
public class AudiFactory extends CarFactory {

    @Override
    public void createAuto() {
        getCarList().add(new AudiA4(200));
        getCarList().add(new AudiR8(300));
                
    }
    
}

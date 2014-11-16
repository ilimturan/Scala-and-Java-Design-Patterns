/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.abstractfactory.java;

/**
 *
 * @author ilimturan
 */
public class Mongodb implements NosqlDb{
    
    /**
     * 
     * @return db description
     */
    @Override
    public String getType() {
        return "Nosql - mongodb";
    }
    
}

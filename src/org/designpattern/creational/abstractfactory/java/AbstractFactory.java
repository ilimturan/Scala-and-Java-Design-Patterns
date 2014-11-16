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
public interface AbstractFactory {
    
    /**
     * 
     * @return db
     */
    public NosqlDb getNosqlDb();
    
    /**
     * 
     * @return db
     */
    public SqlDb getSqlDb();
    
}

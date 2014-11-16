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
public class FactoryImplement2 implements AbstractFactory {
    
    /**
     * 
     * @return db object
     */
    @Override
    public NosqlDb getNosqlDb() {
        return new Cassandra();
    }
    
    /**
     * 
     * @return db object
     */
    @Override
    public SqlDb getSqlDb() {
        return new Postgresql();
    }
    
}

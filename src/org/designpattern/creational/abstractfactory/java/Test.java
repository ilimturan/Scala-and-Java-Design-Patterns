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
public class Test {
    public static void main(String[] arg) {
        
        NosqlDb nosqlDb1 = new FactoryImplement1().getNosqlDb();
        SqlDb sqlDb1 = new FactoryImplement1().getSqlDb();
        
        NosqlDb nosqlDb2 = new FactoryImplement2().getNosqlDb();
        SqlDb sqlDb2 = new FactoryImplement2().getSqlDb();
        
        System.out.println(nosqlDb1.getType());
        System.out.println(nosqlDb2.getType());
        System.out.println(sqlDb1.getType());
        System.out.println(sqlDb2.getType());
        
    }
}

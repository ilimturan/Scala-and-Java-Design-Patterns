/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.prototype.java;

/**
 *
 * @author ilimturan
 */
public class TestElectricalForce {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Earth earthElectricalForce = new Earth(1.0, 2.2, 3.99);
        System.out.println(earthElectricalForce.getPower());
        System.out.println(earthElectricalForce.toString());
        
        Mars marsElectricalForce = (Mars) earthElectricalForce.clone();
        marsElectricalForce.setQ1(2.3);
        marsElectricalForce.setQ2(3.55);
        marsElectricalForce.setK(1.2);
        System.out.println(earthElectricalForce.getPower());
        System.out.println(marsElectricalForce.toString());
        
        Wormhole warmholeElectricalForce = (Wormhole) earthElectricalForce.clone();
        warmholeElectricalForce.setQ1(12.2);
        warmholeElectricalForce.setQ2(32.5095);
        warmholeElectricalForce.setK(111.87);
        System.out.println(warmholeElectricalForce.getPower());
        System.out.println(warmholeElectricalForce.toString());
        
        
        
    }
    
}

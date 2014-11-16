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
public class TestFactoryPattern {
    
    
    public static void main (String[] args) {
        CarFactory bmvFactory = new BmvFactory();
        CarFactory audiFactory = new AudiFactory();
        
        //show bmv cars
        for (Car car : bmvFactory.getCarList()) {
            System.out.println(
                    "Brand: " + car.getBrand() + " - " +
                    "Model: " + car.getModel()+ " - " +
                    "Power: " + car.getPower() + " - "
            );
        }
        
        //show audi cars
        for (Car car : audiFactory.getCarList()) {
            System.out.println(
                    "Brand: " + car.getBrand() + " - " +
                    "Model: " + car.getModel()+ " - " +
                    "Power: " + car.getPower() + " - "
            );
        }
        
    }
}

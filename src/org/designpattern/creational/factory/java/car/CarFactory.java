/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.factory.java.car;

import java.util.ArrayList;

/**
 *
 * @author ilimturan
 */
public abstract class CarFactory {
    
    private ArrayList<Car> carList = new ArrayList<Car>();
    
    
    public CarFactory(){
        this.createAuto();
    }
    
    public abstract void createAuto();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
}

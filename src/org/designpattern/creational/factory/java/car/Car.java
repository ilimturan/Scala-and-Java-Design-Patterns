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
public abstract class Car {
    
    private String brand = null;
    private String model = null;
    private int power = 0;

    public Car(String brand, String model, int power) {
        setBrand(brand);
        setModel(model);
        setPower(power);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

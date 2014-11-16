/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.builder.java;

/**
 *
 * @author ilimturan
 */
public class AsusOrderBuilder extends OrderBuilder {

    @Override
    public void setBrand(String brand) {
        getLaptop().setBrand(new Brand(brand));
    }

    @Override
    public void setModel(String model) {
        getLaptop().setModel(new Model(model));
    }

    @Override
    public void setColor(String color) {
        getLaptop().setColor(color);
    }

    @Override
    public void setCpu(int cpu) {
        getLaptop().setCpu(cpu);
    }

    @Override
    public void setRam(int ram) {
        getLaptop().setRam(ram);
    }
    
}

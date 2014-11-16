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
public abstract class OrderBuilder {
    
    private Laptop laptop = null;
    
    public Laptop getLaptop(){
        if(laptop == null) {
            laptop = new Laptop();
        }
        return laptop;
    }
    
    public abstract void setBrand(String brand);
    public abstract void setModel(String model);
    public abstract void setColor(String color);
    public abstract void setCpu(int cpu);
    public abstract void setRam(int ram);
}

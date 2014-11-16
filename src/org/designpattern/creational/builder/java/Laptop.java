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
public class Laptop {
    
    private Brand brand = null;
    
    private Model model = null;
    
    private String color = null;
    
    private int cpu = 0;
    
    private int ram = 0;

    public Laptop() {
    }
    
    

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", model=" + model + ", color=" + color + ", cpu=" + cpu + ", ram=" + ram + '}';
    }
    
  
}

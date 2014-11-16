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
public class OrderManager {
    
    private OrderBuilder builder;
    
    public Laptop createOrder(String brand, String model, String color, int cpu, int ram){
        if(brand.equals("Samsung")){
            builder = new SamsungOrderBuilder();
        }else if(brand.equals("Asus")){
            builder = new AsusOrderBuilder();
        }
        
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setColor(color);
        builder.setCpu(cpu);
        builder.setRam(ram);
        
        return builder.getLaptop();
        
    }
}

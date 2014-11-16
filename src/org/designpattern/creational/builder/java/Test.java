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
public class Test {
   public static void main(String[] arg) {
       Laptop order1 = new OrderManager().createOrder("Samsung", "s4", "white", 1200, 2048);
       Laptop order2 = new OrderManager().createOrder("Asus", "c11", "gray", 2400, 1024); 
       
       System.out.println(order1);
       System.out.println(order2);
    } 
}

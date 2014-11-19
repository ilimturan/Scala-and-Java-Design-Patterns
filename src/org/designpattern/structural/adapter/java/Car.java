/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.structural.adapter.java;

/**
 *
 * @author ilimturan
 */
class Car {
    //positions
    public int x;
    public int y;
    
    public void run(int speed){
        x += speed;
        //y += speed;
    }
    
    public String getPosition_(){
        return "Position{" + "x=" + x + ", y=" + y + '}';
    }
   
}

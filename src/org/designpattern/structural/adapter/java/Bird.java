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
class Bird {
    //positions
    public int x;
    public int y;
    public int z;
    
    public void fly(int speed){
        x += speed;
        y += speed * 1;
        z += speed * 2;
    }
    
    public String getPosition_(){
        return "Position{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}

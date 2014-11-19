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
class Gear {
    
    //positions
    public int x = 22;
    public int y = 33;
    
    public void rotate(int speed){
        //some rotate procces
    }
    
    public String getPosition_(){
        return "Position{" + "x=" + x + ", y=" + y + '}';
    }
    
}

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
class GearAdapter extends Gear implements ActorInterface {
    
    @Override
    public void move(int speed) {
        this.rotate(speed);
    }
    
    @Override
    public String getPosition() {
        return this.getPosition_();
    }
    
}

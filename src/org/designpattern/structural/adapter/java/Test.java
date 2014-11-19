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
public class Test {
    public static void main(String[] arg) {
        
        /**
         * we have make a game
         * There are three actor; bird, car, gear
         */
        ActorInterface bird = new BirdAdapter();
        bird.move(11);
        System.out.println(bird.getPosition());
        
        
        ActorInterface car = new CarAdapter();
        car.move(6);
        System.out.println(car.getPosition());
        
        ActorInterface gear = new GearAdapter();
        gear.move(22);
        System.out.println(gear.getPosition());
    }
}

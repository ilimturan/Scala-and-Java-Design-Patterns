/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.prototype.java;

/**
 *
 * @author ilimturan
 */
public class Wormhole extends ElectricalForcePrototype {
    
    private Double k = 0.0; // maybe so :)

    public Wormhole(Double q1, Double q2, Double d) {
        
        setQ1(q1);
        setQ2(q2);
        setD(d);
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }
    
    public Double getPower(){
        
        return this.k * ((getQ1() * getQ2()) / (getD() * getD()));
        
    }
    
}

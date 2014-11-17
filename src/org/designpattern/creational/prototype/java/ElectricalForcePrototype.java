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
public abstract class ElectricalForcePrototype implements Cloneable {
    
    private Double q1;
    private Double q2;
    private Double d;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double q1) {
        this.q1 = q1;
    }

    public Double getQ2() {
        return q2;
    }

    public void setQ2(Double q2) {
        this.q2 = q2;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "ElectricalForcePrototype{" + "q1=" + q1 + ", q2=" + q2 + ", d=" + d + '}';
    }
    
}

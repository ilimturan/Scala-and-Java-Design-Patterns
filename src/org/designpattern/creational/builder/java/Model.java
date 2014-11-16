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
class Model {
    
    private String model;

    public Model(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model{" + "model=" + model + '}';
    }    
}

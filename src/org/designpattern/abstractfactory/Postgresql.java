/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.abstractfactory;

/**
 *
 * @author ilimturan
 */
class Postgresql implements SqlDb {

    @Override
    public String getType() {
        return "Nosql - Postgres";
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.factory.document;

/**
 *
 * @author ilimturan
 */
class WordDocument implements Document {

    public WordDocument() {
    }

    @Override
    public String getDocumentType() {
        return "This is a Word document";
    }
    
    
    
    
}

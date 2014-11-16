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
class PdfDocument implements Document{

    public PdfDocument() {
        //throw new RuntimeException("You cant create, please use DocumentFactory");
    }

    @Override
    public String getDocumentType() {
        return "This is a PDF document";
    }
    
}

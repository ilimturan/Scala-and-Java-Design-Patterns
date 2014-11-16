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
public class DocumentFactory {
    
    public static Document createDocumentFactory(String type){
        if(type.equals("PDF")) return new PdfDocument();
        else if(type.equals("WORD")) return new WordDocument();
        else throw new RuntimeException("Format not found");
    }
}

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
public class Test {
    
    public static void main(String[] arg) {
        //Create PDF document
        
        Document pdfDocument = DocumentFactory.createDocumentFactory("PDF");
        System.out.println(pdfDocument.getDocumentType());
    }
    
    
}

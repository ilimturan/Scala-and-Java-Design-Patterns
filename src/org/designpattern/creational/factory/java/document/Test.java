/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.factory.java.document;

/**
 *
 * @author ilimturan
 */
public class Test {
    
    public static void main(String[] arg) {
        //Create PDF document
        
        Document pdfDocument = DocumentFactory.createDocumentFactory("PDF");
        Document wordDocument = DocumentFactory.createDocumentFactory("WORD");
        System.out.println(pdfDocument.getDocumentType());
        System.out.println(wordDocument.getDocumentType());
    }
    
    
}

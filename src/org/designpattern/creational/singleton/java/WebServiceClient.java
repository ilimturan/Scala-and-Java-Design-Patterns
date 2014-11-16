/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpattern.creational.singleton.java;

/**
 *
 * @author ilimturan
 */
public class WebServiceClient {
    
    /**
     * static instance
     */
    private static WebServiceClient instance = null;
    
    /**
     * check object for multi thread
     */
    private static Object check = new Object();
    
    
    /**
     * private construct
     */
    private WebServiceClient(){
        // no this is singleton
    }
    
    public static WebServiceClient instance(){
        if(instance == null){
            synchronized(check){
                if(instance == null) {
                    instance = new WebServiceClient();
                }
            }
        }
        return instance;
    }
    
    public String run(){
        //Do something
        return "Do something";
    }
}

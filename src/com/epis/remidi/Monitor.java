/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epis.remidi;

/**
 *
 * @author Epis Kuswono
 */
public class Monitor {
    private String merk;

    public Monitor(String merk) {
        this.merk = merk;
    }
    
    public void specMonitor(){
        System.out.println(this.merk);
    }
}

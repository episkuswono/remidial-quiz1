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
    private int harga;

    public Monitor(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    
    public void specMonitor(){
        System.out.println(this.merk+" "+this.harga);
    }
}

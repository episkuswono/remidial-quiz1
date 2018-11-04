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
public class Printer {
    private String merk, tipe;
    private int harga;

    public Printer(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    public void specPrinter(){
        System.out.println(this.merk+" "+this.tipe);
    }
}

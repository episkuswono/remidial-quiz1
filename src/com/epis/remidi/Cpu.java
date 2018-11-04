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
public class Cpu {
    private String merk;
    private int kecepatan;

    public Cpu(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }
    
    public void specCpu(){
        System.out.println(this.merk+" "+this.kecepatan);
    }
}

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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public String info(){
        String info = "";
        info += "Merk: "+ this.merk + "\n";
        info += "Kecepatan:"
        
    }
}

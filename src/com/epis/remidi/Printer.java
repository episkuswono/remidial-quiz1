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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String info(){
        String info = "";
        info += "Merk: "+ this.merk + "\n";
        info += "Tipe: "+ this.tipe + "\n";
        info += "Harga: "+"Rp."+ this.harga + "\n";
        return info;
    }
}

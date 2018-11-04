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
public class Komputer {
    private String kode;
    private int harga;
    private Cpu proc;
    private Monitor mon;
    private Printer prin;

    public Komputer(String kode, int harga) {
        this.kode = kode;
        this.harga = harga;
        proc = new Cpu("core I7 7700", 3000000);
        mon = new Monitor("Sony Multiscan", 500000);
        prin = new Printer("Epson L300","Color", 250000);
    }
    
}

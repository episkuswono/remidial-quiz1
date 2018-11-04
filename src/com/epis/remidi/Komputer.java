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

    public Komputer(String kode, int harga, Cpu proc, Monitor mon, Printer prin) {
        this.kode = kode;
        this.harga = harga;
        this.proc = proc;
        this.mon = mon;
        this.prin = prin;
    }
    
    public String info(){
        String info = "";
        info += "Kode: "+ this.kode + "\n";
        info += "Harga: "+ this.harga + "\n";
        info += "CPU : "+ this.proc.info() + "\n";
        info += "Monitor : "+ this.mon.info() + "\n";
        info += "Printer : "+ this.prin.info() + "\n";
        return info;
    }
}

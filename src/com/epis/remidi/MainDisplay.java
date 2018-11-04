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
public class MainDisplay {
    public static void main(String[] args) {
        Cpu proc = new Cpu("core I7 7700", 4);
        Monitor mon = new Monitor("Samsung", 2000000);
        Printer prin = new Printer("Epson L300", "Color", 250000);
        Komputer kom = new Komputer("1", 5000000, proc, mon);
        Komputer kom1 = new Komputer("2", 7000000, proc, mon, prin);
        System.out.println(kom.info());
        System.out.println(kom1.info());
    }
}

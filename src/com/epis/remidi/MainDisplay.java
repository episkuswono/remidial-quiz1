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
        Cpu proc = new Cpu("core I7 7700", 3);
        Monitor mon = new Monitor("Samsung", 2000000);
        Printer prin = new Printer("Epson L300", "Color", 2400000);
        Komputer kom = new Komputer("1", 2500000, proc, mon, prin);
        System.out.println(kom.info());
    }
}

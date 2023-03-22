/**
* File		: MKubus.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 22 Maret 2023
* Deskripsi	: Driver class untuk poligon, bujur sangkar, dan kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
    public static void main(String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(8);
        Kubus kubus = new Kubus(bujursangkar);

        BujurSangkar bujurSangkar2 = new BujurSangkar(16);
        Kubus kubus2 = new Kubus(bujurSangkar2);

        System.out.println("Luas Alas Kubus: " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        System.out.println("Luas Alas Kubus: " + kubus2.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus2.hitungVolume());
    }

}

/**
* File		: Poligon.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 22 Maret 2023
* Deskripsi	: representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;
    public Poligon() {
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
    
}

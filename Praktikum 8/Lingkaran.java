/**
 * File         : Lingkaran.java
 * Penulis	    : Aditya Suryandaru - 24060121140105
 * Tanggal	    : 30 Mei 2023
 * Deskripsi    : Implementasi lingkaran sebagai BangunDatar 
 * 
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }

}

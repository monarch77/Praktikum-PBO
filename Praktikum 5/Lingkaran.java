/**
* File		: Lingkaran.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 25 Maret 2023
* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
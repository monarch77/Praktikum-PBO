/**
* File		: BangunDatar.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 25 Maret 2023
* Deskripsi	: representasi dasar dari objek bujur sangkar, turunan kelas poligon
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
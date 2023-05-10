/**
* File		: Manajer.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 10 Mei 2023
* Deskripsi	: file subclass dari Pegawai
*/

public class Manajer extends Pegawai {
    protected int tunjangan = 700000;
	
	public Manajer(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok + ", Tunjangan : " +tunjangan);
	}
}

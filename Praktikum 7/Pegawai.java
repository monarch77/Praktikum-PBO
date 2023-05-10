/**
* File		: Pegawai.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 10 Mei 2023
* Deskripsi	: file superclass dari Manajer dan Programmmer
*/

public class Pegawai{
	protected String nama;
	protected int gajiPokok = 5000000;
	
	public void setNama(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : " + nama + ", Gaji pokok : " +gajiPokok);
	}
}
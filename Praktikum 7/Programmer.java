/**
* File		: Programmer.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 10 Mei 2023
* Deskripsi	: file subclass dari Pegawai
*/

public class Programmer extends Pegawai {
    protected int bonus = 450000;
	
	public Programmer(String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok + ", Bonus : " + bonus);
	}
}

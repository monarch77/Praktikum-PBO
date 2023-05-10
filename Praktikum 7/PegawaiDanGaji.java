/**
* File		: PegawaiDanGaji.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 10 Mei 2023
* Deskripsi	: file main dari Pegawai 
*/ 

public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai1 = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai1);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}
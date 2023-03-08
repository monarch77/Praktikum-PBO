/**
* Nama File	: OperasiTitik.java
* Penulis 	: Aditya Suryandaru
* NIM		: 24060121140105
* Deskripsi : File yang berisi kelas titik
* Tanggal	: 22 Februari 2023
*
*/
class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;
 
	 Titik(){
		 absis = 0;
		 ordinat = 0;
		 counterTitik++;
	 }
 
	 Titik(double a, double b){
		 absis = a;
		 ordinat = b;
		 counterTitik++;
	 }
 
	public void setAbsis(double a){
		 absis = a;
	 }
 
	public void setOrdinat(double b){
		 ordinat = b;
	 }
 
	 public double getAbsis(){
		 return absis;
	 }
 
	 public double getOrdinat(){
		 return ordinat;
	 }
 
	 public int getCounterTitik(){
		 return counterTitik;
	 }
 }
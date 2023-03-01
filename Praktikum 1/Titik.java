/**
* Titik.java 22/02/22
* Penulis : Aditya Suryandaru
* Deskripsi : File yang berisi kelas titik
*
*
*/
class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
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
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double b){
		ordinat = b;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
	
}
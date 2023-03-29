/**
* File		: BujurSangkar.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 25 Maret 2023
* Deskripsi	: Kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        double luas = sisi * sisi;
        return luas;
    }
}
/* SOAL
 * apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi
   metode abstrak yang ada pada kelas BangunDatar? Jelaskan!
   
   JAWABAN
    Jika kelas "BujurSangkar" tidak membuat implementasi metode abstrak yang ada pada kelas "BangunDatar", maka kelas 
   "BujurSangkar" harus dideklarasikan sebagai kelas abstract juga. Ini akan menyebabkan kesalahan kompilasi, karena 
    kelas abstract tidak dapat diinisialisasi langsung.
    Selain itu, jika kelas "BujurSangkar" tidak mengimplementasikan metode abstrak "hitungLuas" yang ada pada kelas 
   "BangunDatar", maka kelas "BujurSangkar" harus dideklarasikan sebagai kelas abstract juga. Hal ini karena kelas 
    abstract harus mengimplementasikan semua metode abstrak dari kelas induknya.
    Jika kelas "BujurSangkar" digunakan dalam program dan metode "hitungLuas" tidak diimplementasikan, maka akan terjadi
    error saat memanggil metode tersebut. Pesan kesalahan akan muncul pada saat kompilasi atau runtime, tergantung pada 
    bagaimana program dijalankan. Oleh karena itu, penting untuk selalu mengimplementasikan semua metode abstrak yang ada 
    pada kelas abstract saat membuat subclass dari kelas tersebut.
*/

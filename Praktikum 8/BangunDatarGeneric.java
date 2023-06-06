/**
 * File         : BangunDatarGeneric.java
 * Penulis	    : Aditya Suryandaru - 24060121140105
 * Tanggal	    : 30 Mei 2023
 * Deskripsi    : kelas konstruksi generic untuk BangunDatar
 * 
 */

public class BangunDatarGeneric <T4 extends BangunDatar>{
    private T4 bangunDatar;

    public void set(T4 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T4 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*  Jika kita mengganti 'T' dengan karakter lain seperti 'T1', 'T2', atau 'T1234' 
    di dalam kelas BangunDatarGeneric, maka kelas tersebut akan memiliki parameter generik yang berbeda-beda.
    Dengan mengganti karakter 'T' dengan karakter lain, kita hanya mengubah nama parameter generik tersebut. 
    Pada dasarnya, parameter generik digunakan untuk memberikan fleksibilitas dalam menggunakan tipe data yang berbeda. 
    Dalam konteks ini, parameter generik 'T' digunakan untuk membatasi tipe data yang diterima oleh kelas BangunDatarGeneric 
    agar hanya tipe data yang merupakan turunan dari kelas BangunDatar yang dapat digunakan.
    Namun, saat kita mengganti karakter 'T' dengan karakter lain seperti 'T1', 'T2', atau 'T1234', kita harus memperhatikan 
    bahwa karakter tersebut harus masih memenuhi kriteria validitas penamaan variabel di Java. Nama parameter generik harus 
    dimulai dengan huruf, diikuti oleh huruf atau angka, dan tidak boleh menggunakan spasi atau karakter khusus lainnya.
*/
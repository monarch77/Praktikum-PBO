/**
 * Nama file : MLingkaran.java
 * Penulis   : Aditya Suryandaru - 24060121140105
   Tanggal   : 25 Maret 2023
 * Deskripsi : File implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Masukkan jejari lingkaran: ");
            double jejari = scan.nextDouble();
            Lingkaran l = new Lingkaran(jejari);
            System.out.println("Luas lingkaran dengan jejari "+ jejari + " satuan adalah " + l.hitungLuas());
        }finally{
            scan.close();
        }
    }
}
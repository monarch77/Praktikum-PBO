/**
 * Nama file : MBujurSangkar.java
 * Penulis   : Aditya Suryandaru - 24060121140105
 * Tanggal   : 25 Maret 2023
 * Deskripsi : Kelas yang mengimpelemntasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            BujurSangkar bs = new BujurSangkar();
            System.out.print("Masukkan sisi bujur sangkar: ");
            double sisi = scan.nextDouble();
            System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah " +bs.hitungLuas(sisi));
        }finally{
            scan.close();
        }
    }
}
/**
 * File         : MapTest.java
 * Penulis	    : Aditya Suryandaru - 24060121140105
 * Tanggal	    : 30 Mei 2023
 * Deskripsi    : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * 
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        //mengambil elemen pertama
        // System.out.println(map.get(1));

        //mengambil keseleruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        
        //bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci? Tulis pada laporan anda!
        //petunjuk : gunakan iterasi seperti program ArrayListTest

        //iterasi dan mencetak semua nilai dari kunci
        for(String value : map.values()){
            System.out.println(value);
        }
    }
}

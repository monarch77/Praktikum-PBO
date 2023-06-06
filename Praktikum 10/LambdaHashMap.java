/**
 * File         : LambdaMap.java
 * Penulis	    : Aditya Suryandaru - 24060121140105
 * Tanggal	    : 30 Mei 2023
 * Deskripsi    : Ekspresi lambda pada map, digunakan sebagai parameter pada method.
 * 
 */

 import java.util.*;

public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120084", "Adi");
        mahasiswaMap.put("24060121130001", "Bambang");
        mahasiswaMap.put("24060121140084", "Cici");
        mahasiswaMap.put("24060121130049", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " Nama: " + nama ));
    }
}

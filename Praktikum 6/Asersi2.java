/**
* File		: Asersi2.java
* Penulis	: Aditya Suryandaru - 24060121140105
* Tanggal	: 29 Maret 2023
* Deskripsi	: program untuk demo asersi, yang akan menolak input 
              jari-jari lingkaran yang ternilai nol
*/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*-----------------------------------PERTANYAAN-------------------------------------------
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * 
 *------------------------------------JAWABAN---------------------------------------------
 * Dalam program Asersi2 di atas, ada satu hal yang kurang tepat secara konsep yaitu 
 * menggunakan assert statement untuk mengecek input pengguna. Meskipun assert statement 
 * berguna untuk melakukan validasi awal pada program, penggunaan assert statement 
 * seharusnya dibatasi untuk pengembangan dan debugging saja. Hal ini karena assert 
 * statement dapat dinonaktifkan pada saat runtime, sehingga jika terdapat error pada input 
 * pengguna, program tidak akan memberikan pesan error dan dapat menimbulkan masalah pada saat 
 * runtime.
 * 
 */

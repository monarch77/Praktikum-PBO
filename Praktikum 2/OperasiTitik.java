/**
* Nama File	: OperasiTitik.java
* Penulis 	: Aditya Suryandaru
* NIM		: 24060121140105
* Deskripsi : File yang berisi kelas operasi titik
* Tanggal	: 1 Maret 2023
*
*/
class OperasiTitik {
    private void refleksiSumbuX(Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }

    private void refleksiSumbuY(Titik titik){
        double absis = titik.getAbsis();
        absis = absis * -1;
        titik.setAbsis(absis);
    }

    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
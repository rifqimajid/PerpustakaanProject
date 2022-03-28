package com.learning;
import java.lang.Class

//data Anggota
class Anggota{
    //data
    String namaAgt;
    int NPM;
    Pinjam pinjamBuku;

    //constructor
    Anggota(String namaAgt, int NPM){
        this.namaAgt = namaAgt;
        this.NPM = NPM;
    }

    //method
    void peminjaman(pinjam pinjamBuku){
        this.pinjamBuku = pinjamBuku;
    }
}

//data transaksi dalam pepustakaan
class Pinjam{
    //data
    String namaBuku;
    int seriBuku;

    //constructor
    Pinjam(String namaBuku, int seriBuku){
        this.namaBuku = namaBuku;
        this.seriBuku = seriBuku;
    }

    //method
    void dataBuku(){
        System.out.println("Nama Buku: " + namaBuku);
        System.out.println("Seri Buku: " + seriBuku);
    }


    //detail peminjaman
    void dataPeminjaman(){
        System.out.println("Nama Anggota: " + namaAgt);
        System.out.println("NPM: " + NPM);
        namaBuku.dataBuku();
    }
}


public class Main {

    public static void main(String[] args) {
	Anggota majid = new Anggota("Majid", 2015061036);

    Pinjam buku01 = new Pinjam("Java Module", 2022);

    majid.pinjamBuku(buku01);
    }
}

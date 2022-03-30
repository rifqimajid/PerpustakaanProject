package kuispbo;

public class Peminjaman {
    static int id_anggota = 0;
    private boolean pinjam = false;
    private String nama;
    private int NPM;
    private boolean keaktifan = false;
    
    Peminjaman(Mahasiswa peminjam) {
        this.nama = peminjam.getNama();
        this.NPM = peminjam.getNPM();
        this.keaktifan = true;
        this.id_anggota = 1;
     }

     boolean aktif() {
        return this.keaktifan;
     }
     void setKeaktifan(Boolean value) {
        this.keaktifan = value;
     }
     boolean pinjam() {
        return this.pinjam;
     }

     void pinjamBuku(Buku buku) {
        buku.kurangStock(1);
        buku.setStock("kurang", 1);
        System.out.printf("\n========================\n %s meminjam buku \n========================\n", this.nama);
        this.pinjam = true;
   }
   void kembalikanBuku(Buku buku) {
    buku.setStock("tambah", 1);
    // if buku.stock
    System.out.printf("\n==============================\n %s mengembalikan buku \n==============================\n",
          this.nama);
    this.pinjam = false;
 }
}

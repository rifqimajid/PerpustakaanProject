package kuispbo;

public class Absensi {
    Mahasiswa mhs;
    Peminjaman anggota;    
    private boolean status;
    
    void DataPeminjam(Mahasiswa mhs){
        this.mhs = mhs;
    }
    
    
    void tampilData(){
        String statusAnggota = (this.status == true ? "terdaftar" : "blm terdaftar");
        System.out.println(" Nama Peminjam    : " + mhs.nama);
        System.out.println(" No Peminjam      : " + mhs.NPM);
        System.out.println(" Kelas Peminjam   : " + mhs.kelas);
        System.out.println(" Usia Peminjam    : " + mhs.usia);
        System.out.println(" Anggota          : " + this.anggota.aktif());
        if (this.anggota.aktif() != false) {
            String statusPinjam = (this.anggota.pinjam() == true ? "Ya" : "Tidak");
            System.out.printf("Pinjam     : %s\n", statusPinjam);
      }
    }
}

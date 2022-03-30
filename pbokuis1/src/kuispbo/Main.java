package kuispbo;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Rahmat Ramadhan", 2015061037, "TI A", 10);
        new Peminjaman(mhs1);
        mhs1.daftarAnggota(new Peminjaman(mhs1));
        System.out.println("Peminjaman ke : " + mhs1.anggota.id_anggota);


        Buku buku1 = new Buku("Loli yang Kupungut", "AcediaZz", 1011, 99);
        buku1.show();
        mhs1.anggota.pinjamBuku(buku1);
    }
}

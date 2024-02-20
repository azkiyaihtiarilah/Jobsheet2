package jobsheet2;

public class bukuMain07 {
    public static void main(String[] args) {
        buku07 book = new buku07();
        book.judul = "Tentang Laut";
        book.pengarang = "Azkiya Putri";
        book.halaman = 100;
        book.stock = 5;
        book.harga = 10000;

        book.tampilInformasi();;
        book.terjual(5);
        book.gantiHarga(60000);
        book.tampilInformasi();
    }
}

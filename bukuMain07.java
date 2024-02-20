package jobsheet2;

public class bukuMain07 {
    public static void main(String[] args) {
        buku07 book1 = new buku07();
        book1.judul = "Tentang Laut";
        book1.pengarang = "Azkiya Putri";
        book1.halaman = 100;
        book1.stock = 5;
        book1.harga = 10000;

        book1.tampilInformasi();;
        book1.terjual(5);
        book1.gantiHarga(60000);
        book1.tampilInformasi();

        buku07 book2 = new buku07("Self Reward", "Ihtiarilah Azkiya", 160, 29, 59000);
        book2.terjual(11);
        book2.ta
    }
}

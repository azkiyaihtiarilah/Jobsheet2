package jobsheet2;

public class bukuMain07 {
    public static void main(String[] args) {
        buku07 book1 = new buku07();
        book1.judul = "Tentang Laut";
        book1.pengarang = "Azkiya Putri";
        book1.halaman = 100;
        book1.stock = 10;
        book1.harga = 50000;
        book1.terjual = 2;


        book1.tampilInformasi();;
        //book1.terjual(5);
        //book1.gantiHarga(75000);
        book1.tampilInformasi();
        
        double totalHarga = book1.hitungHargaTotal(book1.terjual);
        System.out.println("Total harga buku yang terjual: Rp " + totalHarga);
        double hargaBayar = book1.hitungHargaBayar(book1.terjual);
        System.out.println("Total harga bayar buku1 setelah diskon: Rp " + hargaBayar);
        
        // buku07 book2 = new buku07("Self Reward", "Ihtiarilah Azkiya", 160, 29, 59000);
        // book2.terjual(11);
        // book2.tampilInformasi();

        // buku07 bookAzkiya = new buku07("Yang Telah Hilang", "Azkiyapt", 200,10,80000);
        // bookAzkiya.terjual(1);
        // bookAzkiya.tampilInformasi();
    }
}

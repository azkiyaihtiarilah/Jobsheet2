package jobsheet2;

public class buku07 {
    String judul, pengarang;
    int halaman, stock, harga;

    void tampilInformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah Halaman: "+ halaman);
        System.out.println("Sisa Stock: "+ stock);
        System.out.println("Harga: Rp "+ harga);
    }

    void terjual(int jml){
        if (stock > 0) {
            stock -= jml;
            System.out.println("item terjual: " + jml);
        } else {
            System.out.println("Stok habis. Tidak bisa melakukan penjualan.");
        }
    }

    void restock(int jml){
        stock -= jml;
    }

    void gantiHarga(int hrg){
        harga -= hrg;
    }

    public buku07(){

    }

    public buku07(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stok;
        harga = har;
    }
}

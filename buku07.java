package jobsheet2;

public class buku07 {
    String judul, pengarang;
    int halaman, stock, harga, terjual;

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

    double hitungHargaTotal(double hargaTotal){
        hargaTotal = terjual * harga;
        return hargaTotal;
    }

    double hitungDiskon(double totalHarga){
        if (totalHarga > 150000){
            return 0.12;
        } else if (totalHarga >= 75000 && totalHarga <= 150000){
            return 0.05;
        } else {
            return 0;
        }
    }
    
    double hitungHargaBayar(double terjual){
        double totalHarga = hitungHargaTotal(terjual);
        double diskonHarga = hitungDiskon(totalHarga);
        double totalDiskon = totalHarga * diskonHarga;
        return totalHarga - totalDiskon; 

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

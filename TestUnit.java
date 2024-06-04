package TestUnit_APS;
public class TestUnit {
    public static void main(String[] args) {
        Pesanan pesanan = new Pesanan();

        // daftar toko
        Toko toko1 = new Toko(1, "toko ChiefHadi", "08.00");
        Toko toko2 = new Toko(2, "Cabang toko ChiefHadi", "09.00");

        // daftar produk
        toko1.addProduk(toko1.getProdukId(), "Nasi Goreng", 15000);
        toko1.addProduk(toko1.getProdukId(), "Ayam Goreng", 14000);
        
        toko2.addProduk(toko2.getProdukId(), "Es teh panas", 4000);
        toko2.addProduk(toko2.getProdukId(), "Es Kampul", 5000);
        
        pesanan.addToko(toko1);
        pesanan.addToko(toko2);

        pesanan.pilihToko("toko ChiefHadi");

        pesanan.addItem("Ayam Goreng", 2);
        pesanan.addItem("Nasi Goreng", 3);

        pesanan.cetakInvoice();


    }
}

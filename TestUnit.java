package TestUnit_APS;
public class TestUnit {
    public static void main(String[] args) {
        
        // daftar toko
        Toko toko1 = new Toko(1, "toko ChiefHadi", "08.00");
        Toko toko2 = new Toko(2, "Cabang toko ChiefHadi", "09.00");
        
        // daftar produk
        toko1.addProduk(1, "Nasi Goreng", 15000);
        toko1.addProduk(2, "Ayam Goreng", 14000);
        
        toko2.addProduk(3, "Es teh panas", 4000);
        toko2.addProduk(4, "Es Kampul", 5000);

        // pesanan
        Pesanan pesanan = new Pesanan();
        
        pesanan.addToko(toko1);
        pesanan.addToko(toko2);

        pesanan.pilihToko("toko ChiefHadi");

        pesanan.addItem("Ayam Goreng", 2);
        pesanan.addItem("Nasi Goreng", 3);

        pesanan.cetakInvoice();
    }
}

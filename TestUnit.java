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

        Pesanan pesanan1 = new Pesanan();
        Toko toko = pesanan1.cariToko(1);
        toko.


    }
}

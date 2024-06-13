package TestUnit_APS;
public class TestUnit {
    public static void main(String[] args) {

        
        ProdukManager pm = new ProdukManager();
        pm.addProduk(1, "Nasi Goreng", 15000);
        pm.addProduk(2, "Ayam Goreng", 14000);
        pm.addProduk(3, "Es teh panas", 4000);
        pm.addProduk(4, "Es Kampul", 5000);
        
        User user = new User(0, "Hadi", "hadikresnadi@student.ub.ac.id");

        Pesanan pesanan = user.MakeOrder(0);
        pesanan.addItem(pm.getProduk("Ayam Goreng"), 2);
        pesanan.addItem(pm.getProduk("Es Kampul"), 3);



        // daftar toko
        Toko toko = new Toko(1, "toko ChiefHadi", "08.00");


        pesanan.checkOut(toko.getNamaToko());
    }
}

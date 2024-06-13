package TestUnit_APS;
import java.util.*;

public class ProdukManager {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void addProduk(int id, String nama, float harga){
        Produk produk = new Produk(id, nama, harga);
        daftarProduk.add(produk);
    }

    public Produk getProduk(String nama){
        for (Produk produk : daftarProduk) {
            if (produk.getNamaProduk().equals(nama)){
                return produk;
            }
        }
        return null;
    }
}

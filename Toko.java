package TestUnit_APS;
import java.sql.Time;
import java.util.*;

public class Toko {
    private int idToko;
    private String namaToko;
    private String jamBuka;
    private List<Produk> daftarProduk = new ArrayList();

    public Toko(int id, String nama, String jamBuka){
        this.idToko = id;
        this.namaToko = nama;
        this.jamBuka = jamBuka;
    }

    public int getIdToko() {
        return idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void cetakDaftarProduk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s: %f\n",produk.getNamaProduk(), produk.getHarga());
        }
    }

    public void addProduk(int id, String nama, float harga){
        daftarProduk.add(new Produk(id, nama, harga));
    }

    public void addItem(Produk produk, int quantity){
        // daftarItem.add(new Item(produk, quantity));
    }

    public int getProdukId(){
        return daftarProduk.size();
    }

    public List<Produk> getDaftarProduk(){
        return daftarProduk;
    }
}

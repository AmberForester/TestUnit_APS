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

    public List<Produk> getDaftarProduk(){
        return daftarProduk;
    }
    
    public void addProduk(int id, String nama, float harga){
        daftarProduk.add(new Produk(id, nama, harga));
    }

}

package TestUnit_APS;
public class Produk{
    private int idProduk;
    private String namaProduk;
    private float harga;

    public Produk(int id, String nama, float harga){
        this.idProduk = id;
        this.namaProduk = nama;
        this.harga = harga;
    }

    public int getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
    
    public float getHarga() {
        return harga;
    }
}
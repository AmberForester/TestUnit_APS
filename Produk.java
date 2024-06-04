package TestUnit_APS;
public class Produk{
    private int idProduk;
    private String namaProduk;
    private double harga;

    public Produk(int id, String nama, double harga){
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
    
    public double getHarga() {
        return harga;
    }
}
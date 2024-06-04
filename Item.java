package TestUnit_APS;
public class Item {
    private String idItem;
    private Produk produk;
    private int quantity;

    public Item(Produk produk, int quantity){
        this.produk = produk;
        this.quantity = quantity;
    }

    public String getIdItem() {
        return idItem;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public double hitungSubTotal(){
        return produk.getHarga() * quantity;
    }
}

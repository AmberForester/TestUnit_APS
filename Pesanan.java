package TestUnit_APS;
import java.util.*;

public class Pesanan {
    private int idPesanan;
    private List<Item> daftarItem = new ArrayList<>();
    private String statusPesanan;
    private float totalHarga;

    public Pesanan(int id){
        this.idPesanan = id;
    }

    public void hitungTotal(){
        for (Item item : daftarItem) {
            totalHarga += item.getSubTotal();
        }
    }
    

    public void addItem(Produk produk, int quantity){
        Item item = new Item(produk, quantity);
        daftarItem.add(item);
    }

    public void checkOut(String toko){
        statusPesanan = "Menunggu Konfirmasi";
        hitungTotal();
        cetakInvoice(toko);
    }

    public void cetakInvoice(String toko){
        System.out.println("Kantin FILKOM\nToko: " + toko);
        System.out.println("--------------------------------");
        for (Item item : daftarItem) {
            System.out.println(item.getProduk().getNamaProduk() + "\t" + item.getQuantity() + "\t" + item.getProduk().getHarga());
            System.out.println(item.getSubTotal());
        }
        System.out.println("--------------------------------");
        System.out.println("Subtotal\t:\t" + totalHarga);
        System.out.println("Status Pesanan\t:\t" + statusPesanan);
    }
}

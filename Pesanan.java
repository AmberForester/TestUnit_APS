package TestUnit_APS;
import java.util.*;

public class Pesanan {
    private List<Item> daftarItem = new ArrayList<>();
    private List<Toko> daftarToko =  new ArrayList<>();
    private Toko tokoaja;
    private String statusPesanan;
    private double totalHarga;

    public void CetakDaftarToko(){
        for (Toko toko : daftarToko) {
            System.out.printf("%s: %f",toko.getNamaToko());
        }
    }

    public void hitungTotal(){
        for (Item item : daftarItem) {
            this.totalHarga += item.hitungSubTotal();
        }
    }

    public void addItem(Produk produk, int quantity){
        daftarItem.add(new Item(produk, quantity));
    }

    public void cetakInvoice(){
        
    }

    public Toko cariToko(int id){
        for (Toko toko : daftarToko) {
            if(toko.getIdToko() == id){
                return toko;
            }
        }
        return null;
    }
}

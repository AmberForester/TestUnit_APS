package TestUnit_APS;
import java.util.*;

public class Pesanan {
    private List<Item> daftarItem = new ArrayList<>();
    private List<Toko> daftarToko =  new ArrayList<>();
    private Toko selected = new Toko(0, null, null);
    private String statusPesanan;
    private float totalHarga;

    public float hitungTotal(){
        for (Item item : daftarItem) {
            this.totalHarga += item.getSubTotal();
        }
        return totalHarga;
    }

    public void addItem(String nama, int quantity){
        for (Produk produk : selected.getDaftarProduk()) {
            if (produk.getNamaProduk().equals(nama)) {
                daftarItem.add(new Item(produk, quantity));
                return;
            }
        }
        System.out.println("produk " + nama + " tidak ada");
        System.out.println();
    }

    public void addToko(Toko toko){
        daftarToko.add(toko);
    }


    public void pilihToko(String nama){
        for (Toko toko : daftarToko) {
            if (toko.getNamaToko() == nama) {
                selected = toko;
                return;
            }
        }
    }

    public void cetakInvoice(){
        System.out.println("Kantin FILKOM\nToko: " + selected.getNamaToko());
        System.out.println("Nama Produk" + "   Jumlah \t" + "Harga\t\t" + "Subtotal");
        System.out.println("---------------------------------------------------");
        for (Item item : daftarItem) {
            System.out.println(item.getProduk().getNamaProduk() + "\t" + item.getQuantity() + "\t" + item.getProduk().getHarga() + "\t\t" + item.getSubTotal());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total:\t\t\t\t\t" + hitungTotal());
    }
}

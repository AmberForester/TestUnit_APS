package TestUnit_APS;
import java.util.*;

public class Toko {
    private int idToko;
    private String namaToko;
    private String jamBuka;

    public Toko(int id, String nama, String jamBuka){
        this.idToko = id;
        this.namaToko = nama;
        this.jamBuka = jamBuka;
    }

    public String getNamaToko() {
        return namaToko;
    }
}

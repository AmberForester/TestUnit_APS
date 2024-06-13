package TestUnit_APS;

public class User {

    private int idUser;
    private String namaUser;
    private String email;

    public User (int id, String nama, String email){
        this.email = email;
        this.namaUser = nama;
        this.idUser = id;
    }

    public Pesanan MakeOrder(int id){
        Pesanan pesanan = new Pesanan(id);
        return pesanan;
    }
}

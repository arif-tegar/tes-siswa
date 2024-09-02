//Object Class
public class Siswa {
    int id;
    private String nama;
    private double ipk;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    /*Constuctor nama sama dgn nama Class*/
    public Siswa() {
        id = 0;
        nama = "";
        ipk = 0;
        

    }
    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;       
        this.ipk = ipk;
    }
    // Getter --> Mendapatkan nilai --> tipe data
    public int getid() {
    return id;
    }
    public String getnama(){
        return nama;
    }
    public double getipk() {
        return ipk;
    }
    //Setter --> mengubah nilai --> void
    public void setid(int id) {
        this.id =id;
    }
    public void setnama(String nama){
        this.nama =nama;
    }
    public void setipk(double ipk){
        this.ipk = ipk;
    }

    //method tdk mengahsilakn value
    public void print () {
        System.out.println("---------");
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
    //method yg menghasilkan nilai value 
    public String print2() {
    return "ID : " + id
    + "\nNama : " + nama 
    + "\nIPK : " + ipk;

    }

}

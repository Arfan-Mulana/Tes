// Object class
public class Guru {  
    private int id;  
    private String nama;  
    private String mapel;  
    private String alamat;  
 
    // Default constructor
    public Guru() {  
        id = 0;  
        nama = "";  
        mapel = "";  
        alamat = "";  
    }  
 
    // Constructor with parameters
    public Guru(int id, String nama, String mapel, String alamat) {  
        this.id = id;  
        this.nama = nama;  
        this.mapel = mapel;  
        this.alamat = alamat;  
    }  
 
    // Getters
    public int getId() {  
        return id;  
    }  
 
    public String getNama() {  
        return nama;  
    }  
 
    public String getMapel() {  
        return mapel;  
    }  
 
    public String getAlamat() {  
        return alamat;  
    }

    // Main method for testing
    public static void main(String[] args) { 
        Guru guru1 = new Guru(1, "Budi", "Matematika", "Jakarta");
        System.out.println("ID: " + guru1.getId());
        System.out.println("Nama: " + guru1.getNama());
        System.out.println("Mapel: " + guru1.getMapel());
        System.out.println("Alamat: " + guru1.getAlamat());
    }
}
package Tugas;
public class Manager extends Employee {
    public String nama;
    public String jabatan;
    public String id;

    public Manager(String id, String nama, String jabatan, int kerja) {
        this.id = id;
        this.jabatan = jabatan;
        this.nama = nama;
        this.kerja = kerja;
        hitungGaji(); tunjManager(); 
    }
    public void tunjManager(){
        totalgaji += (0.1*totalgaji);
    }
    public void displayInfo(){
        System.out.println("============||Data Anda||============");
        System.out.println("Nama: "+nama);
        System.out.println("ID Kerja: "+id);
        System.out.println("Jabatan: "+jabatan);
        System.out.println("Tahun Masuk: "+masuk);
        System.out.println("Lama Kerja: "+kerja+" Tahun");
        System.out.println("Total Gaji: Rp "+totalgaji);
    }
}
package Tugas;
public class PegawaiTT extends Employee {
    public String nama;
    public String jabatan;
    public String id;
    protected int jam;
    protected long lembur;
    protected double gajil = 10000;

    public PegawaiTT(String id, String nama, String jabatan, int kerja) {
        this.id = id;
        this.jabatan = jabatan;
        this.nama = nama;
        this.kerja = kerja;
        hitungGaji();
    }
    public void setJam(int a){
        this.jam = a;
        setLembur();
    }
    public void setLembur(){
        if(jam>10){
            totalgaji += (jam*gajil);
        }
        else{
            totalgaji += 0;
        }
    }
    public void hitungGaji(){
        if(kerja<=5){
            totalgaji = (long) (kerja*12*gaji);
        }
        else if(6<=kerja && kerja<=10){
            totalgaji =  (long) (kerja*(12*gaji)+(0.05*(kerja*gaji)));
        }
        else if(kerja>10){
            totalgaji = (long) (kerja*(12*gaji)+2*(0.1*(kerja*gaji)));
        }
    }
    public void displayInfo(){
        System.out.println("============||Data Anda||============");
        System.out.println("Nama: "+nama);
        System.out.println("ID Kerja: "+id);
        System.out.println("Jabatan: "+jabatan);
        System.out.println("Tahun Masuk: "+masuk);
        System.out.println("Lama Kerja: "+kerja+" Tahun");
        System.out.println("Jam Lembur: "+jam+" Jam");
        System.out.println("Total Gaji: Rp "+totalgaji);
    }
}
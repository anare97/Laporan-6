package Tugas;
public class Employee {
    protected int kerja;
    protected boolean istri;
    protected boolean anak;
    protected long totalgaji;
    protected final double gaji = 200000;
    protected int masuk;
    
    public void setMasuk(int a){
        this.masuk = a;
    }
    public void hitungGaji(){
        if(kerja<=5){
            totalgaji = (long) ((long) kerja*(12*gaji));
        }
        else if(6<=kerja && kerja<=10){
            totalgaji =  (long) ((long) kerja*((12*gaji)+(0.05*(kerja*gaji))));
        }
        else if(kerja>10){
            totalgaji = (long) ((long) kerja*((12*gaji)+2*(0.1*(kerja*gaji))));
        }
        tunjIstri(); tunjAnak();
    }
    public void tunjIstri(){
        if(istri==true){
            totalgaji += (0.1*totalgaji);
        }
        else{
            totalgaji += 0;
        }
    }
    public void tunjAnak(){
        if(anak==true){
            totalgaji += (0.15*totalgaji);
        }
        else{
            totalgaji += 0;
        }
    }
    public void cekIstriAnak(String a, int b){
        if(a.equalsIgnoreCase("Menikah")){
            this.istri = true;
        }
        else{
            this.istri = false;
        }
        if(b>0){
            this.anak = true;
        }
        else{
            this.anak = false;
        }
    }
}
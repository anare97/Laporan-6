package Tugas;
import java.util.*;
public class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("=========||Database Pegawai||=========");
        System.out.print("Nama: ");
        String a = in.nextLine();
        System.out.print("ID Kerja: ");
        String b = in.next();
        System.out.print("Jabatan: ");
        String c = in.nextLine(); c = in.nextLine();
        System.out.print("Lama kerja (tahun): ");
        int f = in.nextInt();
        System.out.print("Status (Menikah/Lajang): ");
        String g = in.next();
        System.out.print("Jumlah Anak: ");
        int h = in.nextInt(); 
        System.out.print("Tahun Masuk: ");
        int i = in.nextInt();
        if(c.equalsIgnoreCase("Manager")){
            Manager baru = new Manager(b,a,c,f);
            baru.cekIstriAnak(g, h); baru.setMasuk(i);
            baru.displayInfo();
        }
        else if(c.equalsIgnoreCase("Pegawai Tetap")){
            PegawaiT peg1 = new PegawaiT(b,a,c,f);
            peg1.cekIstriAnak(g, h); peg1.setMasuk(i);
            peg1.displayInfo();
        }
        else if(c.equalsIgnoreCase("Pegawai Tidak Tetap")){
            PegawaiTT peg2 = new PegawaiTT(b,a,c,f);
            peg2.setMasuk(i);
            System.out.print("Jam Lembur: ");
            int j = in.nextInt();
            peg2.setJam(j); peg2.displayInfo();
        }
    }
}
package tambahan4;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Tambahan4 extends JFrame {
    public static void main(String[] args) {
        Tambahan4 tugas4 = new Tambahan4();
        tugas4.setVisible(true);
    }
    
    JLabel tampil_waktu = new JLabel();
    JLabel tampil_tanggal = new JLabel();
    JLabel tampil_hari = new JLabel();

    public Tambahan4() {
        this.setTitle("Tambahan Praktikum 4");
        this.setSize(350,200);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(tampil_waktu);
        this.add(tampil_tanggal);
        this.add(tampil_hari);

        new Thread() {
            public void run() {
                while(true) { 
                    Calendar kalender = new GregorianCalendar();
                    int detik = kalender.get(Calendar.SECOND);
                    int menit = kalender.get(Calendar.MINUTE);
                    int jam = kalender.get(Calendar.HOUR);
                    int am_pm = kalender.get(Calendar.AM_PM);
                    int urut_hari = kalender.get(Calendar.DAY_OF_WEEK);
                    int tanggal = kalender.get(Calendar.DATE);
                    int urut_bulan = 1+kalender.get(Calendar.MONTH);
                    int tahun = kalender.get(Calendar.YEAR);
                    
                    String nama_hari[] = {" ","Minggu","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
                    String nama_bulan[] = {" ", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", 
                        "Agustus", "Sebtember", "Oktober", "November", "Desember"};
                    String nol_detik = "", nol_menit = "", nol_jam = "", format = "";
                    
                    if (detik<=9){ nol_detik = "0"; }
                    if (menit<=9){ nol_menit = "0"; }
                    if (jam<=9){ nol_jam = "0"; }
                    if (jam==0){ nol_jam = ""; jam=12; }
                    if (am_pm == 1){ format = "PM"; }
                    if (am_pm != 1){ format="AM"; }

                    tampil_waktu.setBounds(50,63,300,50);
                    tampil_waktu.setText(nol_jam+jam+":"+nol_menit+menit+":"+nol_detik+detik+"  "+format);
                    tampil_waktu.setForeground(Color.green);
                    tampil_waktu.setFont(new java.awt.Font(Font.SANS_SERIF,3,40));
                    
                    tampil_tanggal.setBounds(30,25,200,20);
                    tampil_tanggal.setText(tanggal+" "+nama_bulan[urut_bulan]+" "+tahun);
                    tampil_tanggal.setForeground(Color.red);
                    tampil_tanggal.setFont(new java.awt.Font(Font.SANS_SERIF,1,20));
                    
                    tampil_hari.setBounds(245,120,900,30);
                    tampil_hari.setText(nama_hari[urut_hari]);
                    tampil_hari.setForeground(Color.blue);
                    tampil_hari.setFont(new java.awt.Font(Font.SANS_SERIF,1,20));
                }
            }
        }.start(); 
    }
}

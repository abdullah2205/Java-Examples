
/////////////////////////////////////////////////

package tambahan4;
import java.util.*;
import javax.swing.*;


public class Tambahan4 extends JFrame
{
    public static void main(String[] args) 
    {
        Tambahan4 tugas4 = new Tambahan4();
        tugas4.setVisible(true);
    }

    Calendar kalender = new GregorianCalendar();
    int detik = kalender.get(Calendar.SECOND);
    int menit = kalender.get(Calendar.MINUTE);
    int jam = kalender.get(Calendar.HOUR);
    int urut_hari = kalender.get(Calendar.DAY_OF_WEEK);
    String nama_hari[] = {" ","MINGGU","SENIN","SELASA","RABU","KAMIS","JUMAT","SABTU"};

    String waktu = jam+":"+menit+":"+detik;
    String tanggalan = nama_hari[urut_hari];

    JLabel tampil_waktu = new JLabel();
    JLabel tampil_tanggal = new JLabel();
    
            this.add(tampil_waktu);
        this.add(tampil_tanggal);
        tampil_waktu.setBounds(40,40,200,20);
        tampil_waktu.setText(waktu);
        tampil_tanggal.setBounds(40,70,200,20);
        tampil_tanggal.setText(tanggalan);
        
    
    
    public Tambahan4()
    {
        this.setTitle("jendela utama");
        this.setSize(400,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
//        this.add(tampil_waktu);
  //      this.add(tampil_tanggal);
    //    tampil_waktu.setBounds(40,40,200,20);
      //  tampil_waktu.setText(waktu);
        //tampil_tanggal.setBounds(40,70,200,20);
        //tampil_tanggal.setText(tanggalan);
        
    }
    
}

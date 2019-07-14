package praktikum4;
import javax.swing.*;
import java.awt.event.*;

public class Praktikum4 extends JFrame implements ActionListener
{
    public static void main(String[] args) 
    {
        Praktikum4 tugas4 = new Praktikum4();
        tugas4.setVisible(true);
    }

    String tampung_nama,tampung_waktu, bayaran;
    int waktu;
    double perjam=160333.333;
    JLabel nama = new JLabel("Nama Karyawan : ");
    JLabel lama = new JLabel("Lama Kerja (jam) : ");
    JTextField isi_nama = new JTextField();
    JTextField isi_waktu = new JTextField();
    JButton ngecek = new JButton("Cek");
    JButton ngapus = new JButton("Hapus");
        
    public Praktikum4()
    {
        setTitle("Hitung Gaji Karyawan per Jam");
        this.setSize(400,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.add(nama);
        this.add(lama);
        this.add(isi_nama);
        this.add(isi_waktu);
        this.add(ngecek);
        this.add(ngapus);
        nama.setBounds(30, 30, 150, 20);
        lama.setBounds(30, 70, 150, 20);
        isi_nama.setBounds(150, 30, 200, 20);
        isi_waktu.setBounds(150, 70, 200, 20);
        ngecek.setBounds(150, 110, 100, 20);
        ngapus.setBounds(250, 110, 100, 20);
        ngecek.addActionListener(this);
        ngapus.addActionListener(this);
    }    
    
    @Override
    public void actionPerformed(ActionEvent aksi) 
    {
       Object tekan = aksi.getSource();
       if (tekan == ngecek)
       {
           tampung_nama = isi_nama.getText();
           tampung_waktu = isi_waktu.getText();
           waktu=Integer.parseInt(tampung_waktu);
           double total_gaji =waktu*perjam;
           JOptionPane.showMessageDialog(this, "Karyawan Bernama "+tampung_nama+"\nmendapatkan gaji sebesar Rp. "+Math.round(total_gaji));
       }
       if (tekan == ngapus)
       {
           isi_nama.setText("");
           isi_waktu.setText("");
       }
    }

}
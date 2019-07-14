package fatkhur_p4;
//import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;

public class Fatkhur_p4 extends JFrame// implements ActionListener
{
    String tampung_suhu;
    public static void main(String[] args) 
    {
        Fatkhur_p4 fatkhur4 = new Fatkhur_p4();
        fatkhur4.setVisible(true);        
    }
    
    JLabel celcius = new JLabel("temp in celcius");
    JLabel fahrenheit = new JLabel("temp in fahrenheit");
    JTextField in_cel = new JTextField();
    JTextField in_fah = new JTextField();
    
    public Fatkhur_p4() {
        this.setTitle("Tambahan Praktikum 4");
        this.setSize(400,200);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(celcius);
        this.add(fahrenheit);
        this.add(in_cel);
        this.add(in_fah);
        celcius.setBounds(30, 30, 150, 30);
        fahrenheit.setBounds(30, 70, 150, 30);
        in_cel.setBounds(150, 30, 200, 30);
        in_fah.setBounds(150, 70, 200, 30);
        //tampung_suhu = in_cel.getText();
        
        in_cel.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() 
        {
            String tampung_suhu;
            double az, z = 1.8;
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                if(tampung_suhu != "")
                {
                tampung_suhu = 0+in_cel.getText();
                
                az = Double.parseDouble(tampung_suhu);
                String b = Double.toString((z*az)+32);  
                in_fah.setText(b);}
                
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                if(tampung_suhu != "")
                {
                tampung_suhu = in_cel.getText();
                az = Double.parseDouble(tampung_suhu);
                String b = Double.toString((z*az)+32);
                in_fah.setText(b);}
                
                
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                if(tampung_suhu != "")
                {
                tampung_suhu = in_cel.getText();
                az = Double.parseDouble(tampung_suhu);
                String b = Double.toString((z*az)+32);
                in_fah.setText(b);}
                
                
            }
        }
        );
    }
}

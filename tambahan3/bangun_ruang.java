package tambahan3;
import java.util.Scanner;
public class bangun_ruang 
{
    int sub_menu2;
    Scanner sub_input = new Scanner(System.in); 
    
    void main_menu2(){
        while (true){
            menu2();
            System.out.printf("Masukan pilihan anda: ");
            sub_menu2=sub_input.nextInt();
            if (sub_menu2 == 1){
                vol_kubus(); 
            }                    
            if (sub_menu2 == 2){
                vol_bola(); 
            }                                        
            if (sub_menu2 == 3){
                break;
            }                                     
            if (sub_menu2 == 4){
                break;
            }
        }  
    }
    
    void menu2()
    {
        System.out.printf("\nMenu Bangun Ruang \n");
        System.out.printf("1. Menghitung Volume Kubus \n");
        System.out.printf("2. Menghitung Volume Bola \n");
        System.out.printf("3. Kembali \n");
        System.out.printf("4. Keluar \n");
    }
    
    void vol_kubus()
    {
        System.out.printf("Masukan Sisi = ");
        int s = sub_input.nextInt();
        System.out.printf("Volume = %d \n",s*s*s);
    }
    
    void vol_bola()
    {
        System.out.printf("Masukan Diameter = ");
        int d = sub_input.nextInt();
        double r = d/2;
        double phi = 3.14;
        double z = 4.0/3.0;
        System.out.printf("Volume = %.0f \n",z*phi*r*r*r);
    }
    
}

package tambahan3;
import java.util.Scanner;
public class bangun_datar 
{
    int sub_menu1;
    Scanner sub_input = new Scanner(System.in);
    
    void main_menu1(){        
        while (true){
            menu1();
            System.out.printf("Masukan pilihan anda : ");
            sub_menu1=sub_input.nextInt();
            if (sub_menu1 == 1){
                luas_pp(); 
            }                    
            if (sub_menu1 == 2){
                luas_jg(); 
            }                                        
            if (sub_menu1 == 3){
                break;
            }                                     
            if (sub_menu1 == 4){
                break;
            }                
        }
    }    

    void menu1()
    {
        System.out.printf("\nMenu Bangun Datar \n");
        System.out.printf("1. Menghitung Luas Persegi Panjang \n");
        System.out.printf("2. Menghitung Luas Janjaran Genjang \n");
        System.out.printf("3. Kembali \n");
        System.out.printf("4. Keluar \n");
    }
    
    void luas_pp()
    {
        System.out.printf("Masukan Panjang = ");
        int p = sub_input.nextInt();
        System.out.printf("Masukan Lebar = ");
        int l = sub_input.nextInt();
        System.out.printf("Luas = %d \n",p*l);
    }
    
    void luas_jg()
    {
        System.out.printf("Masukan Alas = ");
        int a = sub_input.nextInt();
        System.out.printf("Masukan Tinggi = ");
        int t = sub_input.nextInt();
        System.out.printf("Luas = %d \n",a*t);
    }
}


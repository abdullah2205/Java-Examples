package tambahan3;
import java.util.Scanner;
public class utama 
{
    public static void main(String[] args) 
    {
        bangun_datar menu_bd = new bangun_datar();
        bangun_ruang menu_br = new bangun_ruang();
        matrix menu_mx = new matrix();
        int main_menu;
        while(true)
        {
            Scanner input = new Scanner(System.in);
            System.out.printf("\nMenu Utama\n1. Menghitung Luas Bangun Datar\n2. Menghitung Volume Bangun Ruang\n3. Menghitung Matriks\n4. Keluar\n");
            System.out.printf("Masukan pilihan anda : ");
            main_menu=input.nextInt();
            
            if (main_menu == 1){
                menu_bd.main_menu1();
            }
            if (main_menu == 2){
                menu_br.main_menu2();              
            }
            if (main_menu == 3){
                menu_mx.main_menu3();              
            }
            if (main_menu == 4 || menu_bd.sub_menu1 == 4 || menu_br.sub_menu2 ==4 || menu_mx.sub_menu3 == 4)
            {
                break;
            }
        }
    }
    
}

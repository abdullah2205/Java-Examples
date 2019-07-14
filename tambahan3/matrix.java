package tambahan3;
import java.util.Scanner;
public class matrix 
{
    int sub_menu3;
    Scanner sub_input = new Scanner(System.in);
    
    void main_menu3()
    {
        while (true){
            menu3();
            System.out.printf("Masukan pilihan anda : ");
            sub_menu3=sub_input.nextInt();
            if (sub_menu3 == 1){
                trn_matrix(); 
            }                    
            if (sub_menu3 == 2){
                jml_matrix(); 
            }                                        
            if (sub_menu3 == 3){
                break;
            }                                     
            if (sub_menu3 == 4){
                break;
            }
        }         
    }
    
    void menu3()
    {
        System.out.printf("\nMenu Matrix \n");
        System.out.printf("1. Transpose Matriks \n");
        System.out.printf("2. Penjumlahan Matriks \n");
        System.out.printf("3. Kembali \n");
        System.out.printf("4. Keluar \n");
    }
    
    void trn_matrix()
    {
        int i, j, b, k;
        int matriks[][], transpose[][];
        System.out.printf("Masukkan jumlah baris = ");
        b = sub_input.nextInt();
        System.out.printf("Masukkan jumlah kolom = ");
        k = sub_input.nextInt();
        matriks = new int[b][k]; 
        transpose = new int[k][b];
    
        for(i = 0; i < b; i++){
            for(j = 0; j< k; j++){
                System.out.printf("M[%d,%d] = ", i+1, j+1);
                matriks[i][j] = sub_input.nextInt();
            }
        }

        System.out.println("Matriks A : ");
        for(i = 0; i < b; i++){
            for(j = 0; j< k; j++){
                System.out.printf("%d\t",matriks[i][j]);
            }
            System.out.println();
        }    
    
        for(i = 0; i < b; i++){
            for(j = 0; j< k; j++){
                transpose[j][i] = matriks[i][j];
            }
        }

        System.out.println("Transpose Matriks A : ");
        for(i = 0; i < k; i++){
            for(j = 0; j< b; j++){
                System.out.printf("%d\t",transpose[i][j]);
            }
            System.out.println();
        
        }
    }

    void jml_matrix(){
        int i, j, bk;
        int matriks_a[][], matriks_b[][], matriks_c[][];
         
        System.out.printf("Masukkan jumlah baris dan kolom = ");
        bk = sub_input.nextInt();
        matriks_a=new int[bk][bk];
        matriks_b=new int[bk][bk];
        matriks_c=new int[bk][bk];
        
        for(i = 0; i < bk; i++){
            for(j = 0; j< bk; j++){
                System.out.printf("MA[%d,%d] = ", i+1, j+1);
                matriks_a[i][j] = sub_input.nextInt();
            }
        }
        for(i=0; i < bk; i++){
            for(j=0; j< bk; j++){
                System.out.printf("MB[%d,%d] = ", i+1, j+1);
                matriks_b[i][j]=sub_input.nextInt();
            }
        }
        for(i=0; i < bk ; i++){
            for(j=0; j < bk; j++){
                matriks_c[i][j] = matriks_a[i][j]+matriks_b[i][j];
            }
        }
      
        System.out.println("Matriks C : ");
        for(i=0; i < bk; i++){
            for(j=0; j < bk; j++){
                System.out.printf("%d\t",matriks_c[i][j]);
            }
            System.out.println(" ");
        }
    }
}
    
    

package kerpekan_jmlmtrx;
import java.util.Scanner;
public class Kerpekan_jmlMtrx {
    public static void main(String[] args) {
        int i, j, bk;
        Scanner inputan= new Scanner (System.in);
        
        int matriks_a[][], matriks_b[][], matriks_c[][];
         
        System.out.printf("Masukkan jumlah baris dan kolom = ");
        bk = inputan.nextInt();
        matriks_a=new int[bk][bk];
        matriks_b=new int[bk][bk];
        matriks_c=new int[bk][bk];
        for(i = 0; i < bk; i++){
            for(j = 0; j< bk; j++){
                System.out.printf("MA[%d,%d] = ", i+1, j+1);
                matriks_a[i][j] = inputan.nextInt();
            }
        }
      
        for(i=0; i < bk; i++){
            for(j=0; j< bk; j++){
                System.out.printf("MB[%d,%d] = ", i+1, j+1);
                matriks_b[i][j]=inputan.nextInt();
            }
        }
      
        /* Melakukan penjumlahan matriks*/
        for(i=0; i < bk ; i++){
            for(j=0; j < bk; j++){
                matriks_c[i][j] = matriks_a[i][j]+matriks_b[i][j];
            }
        }
      
        System.out.println("\nMatriks C : ");
        for(i=0; i < bk; i++){
            for(j=0; j < bk; j++){
                System.out.printf("%d\t",matriks_c[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}

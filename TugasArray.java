import java.util.Arrays;
import java.util.Scanner;

public class TugasArray {
     public static void main(String[] args) {
          Scanner tuut = new Scanner(System.in);
          System.out.println("Silahkan ketik cara penghitungan anda ");
          System.out.println("1 untuk penjumlahan (+)\n2 untuk pengurangan (-)");

          int cara = tuut.nextInt();
          int hasil = 0;
          


          System.out.println("\nSilahkan masukan angka pertama anda ");

          int[] simpenan = new int[4];
          simpenan[0] = tuut.nextInt();

          System.out.println("\nSilahkan masukan angka kedua anda ");
          simpenan[1] = tuut.nextInt();

          System.out.println("\nSilahkan masukan angka ketiga anda ");
          simpenan[2] = tuut.nextInt();

          System.out.println("\nSilahkan masukan angka keempat anda ");
          simpenan[3] = tuut.nextInt();


          if(cara == 1){
               for(int i = 0; i < simpenan.length; i++){

                    hasil += simpenan[i];
               }
               System.out.println("\nHasil penjumlahan anda yaitu: "+hasil);

          }else if(cara == 2){
               for(int i = 1; i < simpenan.length; i++){
                   hasil -= simpenan[i];
               }
               System.out.println("\nHasil penguranggan anda yaitu: "+ hasil);

          }else{
               System.out.println("Pilihan diluar jangkauan!");
          }

          

     }       
}
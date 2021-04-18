import java.util.*;
import java.util.Scanner;
public class helo {
    static float total = 0, bil1 = 1, bil2 = 1;
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Masukan Bilangan Ke 1 :");
    bil1=input.nextFloat();
    System.out.print("Masukan Bilangan Ke 2 :");
    bil2=input.nextFloat();
   
    while(bil2!=0 && bil1!= 0){
        System.out.println("");
        System.out.println("(+) Kalkulator with Java ");
        System.out.println("(+) Coded by H-Nut");
        System.out.println("(1) Penjumlahan");
        System.out.println("(2) Pengurangan");
        System.out.println("(3) Pembagian");
        System.out.println("(4) Perkalian");
        System.out.print("(+) Masukan Pilihan :");
        int pilihan = input.nextInt();
       
        switch(pilihan){
            case 1:
                System.out.println( + bil1+ "+" + bil2);
                System.out.print("(-) Hasilnya = ");
                total = bil1 + bil2;
                break;
            case 2:
                System.out.println( + bil1+ "-" + bil2);
                System.out.print("(-) Hasilnya = ");
                total = bil1 - bil2;
                break;
            case 3:
                System.out.println( + bil1+ "/" + bil2);
                System.out.print("(-) Hasilnya = ");
                total = bil1 / bil2;
                break;
            case 4:
                System.out.println( + bil1+ "*" + bil2);
                System.out.print("(-) Hasilnya = ");
                total = bil1 * bil2;
                break;
            default:
                System.out.println("(!) Isi angka nya dulu tolol");
        }
        System.out.println(total);
       
        }
    }
 }

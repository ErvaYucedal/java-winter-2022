package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

       //Soru 7)Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:"  + ilkHarf);

        Scanner scan1= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");
        char ilkHarf1=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:" + ilkHarf);
    }
}

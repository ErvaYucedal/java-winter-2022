package day05_matematikselislemler;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        //kullanicidan 3 basamakli bir sayi alip rakamlar toplami yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        //sayi 573 olsun
        int rakamlarToplami=0;

        int rakam=sayi%10;

        rakamlarToplami+=rakam;
        sayi/=10;
        System.out.println(sayi);

        rakam=sayi%10;





    }
}

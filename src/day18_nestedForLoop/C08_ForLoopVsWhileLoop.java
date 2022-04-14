package day18_nestedForLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplamak istedigi sayilari alin
        //kullanici 0'a basincaya kadar devam edin
        //kullanici 0'a bastiginda
        //tum sayilari toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        /*
        for (int i = 1; i < 10000; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;
            } else {
                toplam += sayi;
            }


        }

         */
        System.out.println(toplam);

        sayi = 1;
        toplam= 0;
        while (sayi!= 0) {
        System.out.println("Lutfen bir sayi giriniz");
        sayi = scan.nextInt();
        toplam += sayi;
    }
        System.out.println(toplam);


        //baslangic, bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir,

        //adim sayisi belli degilse while loop daha avantajlidir.




    }}

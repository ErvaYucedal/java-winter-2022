package deneme;

import java.util.Scanner;

public class deneme7 {
    public static void main(String[] args) {
        /* //switch
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kainci ay oldugunu giriniz");
        int ayNo= scan.nextInt();
        switch (ayNo) {
            case 1:
        System.out.println("ocak");
        break;
            case 2:
                System.out.println("subat");
                break;
                */

        Scanner scanner= new Scanner(System.in);
        System.out.println("kullanici adinizi giriniz");
        String kullaniciAdi = scanner.nextLine();
        System.out.println("kllanici sifrenizi giriniz");
        int kullaniciSifre= scanner.nextInt();

        switch (kullaniciAdi){
            case "admin":
                System.out.println("hosgeldin yonetici");
                break;
            case "normal":
                System.out.println("hosgeldin");
                break;

         }


    }
}

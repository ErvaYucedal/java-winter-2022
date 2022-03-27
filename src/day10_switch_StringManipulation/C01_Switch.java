package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

        //kullanicidan sayi olarak kacinci ay oldugunu alip
        //istenen ay ismini yazidran bir program yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        //bu soruyu if else ile yapabiliriz ama art arda 12 if else cok kalabalik
        // ve anlasilmasi guc olabilir
        //bunun yerine switch - case yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");
        }
        //switch icine yazilan variablenin degerine gore
        //ilgili case'i gorene kdar kodu calistirir
        //egeer break yoksa bitene kadar calitirir
        //if elsedeki son else gibi geriye kalan durumlari
        //tamamen kapsayacak

    }

}

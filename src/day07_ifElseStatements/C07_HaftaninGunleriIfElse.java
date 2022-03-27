package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElse {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanici gun ismini yanlis girerse "yanlis giris" yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise === hafta sonu
        //pazartesi veya sali veya carsamba veya persembe veya cuma ise == hafta ici
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase();
        //hatali girisleri de yazdirmak icin
        //olasiliklari 3' cikartalim

        //haftasonu-haftaici-yanlis giris
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        } else if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe")||gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici"); }
        else {
            System.out.println("lutfen gecerli bir gun giriniz");}
        //eger if else if .... statement else ile bitiyorsa
        //olasiliklardan sadece bir tanesi mutlaka calisir
        //java ilk buldugu true a ait sonucu yazdirir
        //ve kalan sartlara bakmaz

        }
    }


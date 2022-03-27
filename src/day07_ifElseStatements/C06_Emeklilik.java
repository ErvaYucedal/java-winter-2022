package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas>65) {
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas+"sene daha calismalisin");
        }
    }
}
 // if else statemenler'larda iki durumdan sadece ve sadece biri calisir
// ikisinin birden calisma ihtimali ====YOK
//ikisinin de calismama ihtimali ===YOK
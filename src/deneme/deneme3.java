package deneme;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {

        //girilen bir karakterin harf olup olmadigini bulalim
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);
        if ((karakter>='A' && karakter<= 'Z') ||
        (karakter>='a' && karakter<='z')) {
            System.out.println("Girdiginiz karakter bir harf");
        } else {
                System.out.println("Girdiginiz karakter harf degil");
    }
}}

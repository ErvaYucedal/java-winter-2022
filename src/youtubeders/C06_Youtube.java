package youtubeders;

import java.util.Scanner;

public class C06_Youtube {
    public static void main(String[] args) {
        int quiz,vize,ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Quiz Notunu Giriniz");
        quiz= input.nextInt();
        System.out.println("Vize notunu giriniz");
        vize= input.nextInt();
        System.out.println("ffinal notunu giriniz");
        ffinal=input.nextInt();
        ortalama= (quiz*0.2) + (vize*0.35)+ (ffinal*0.45);
        System.out.println("not ortalamanız:" + ortalama);
        String sonuc= (ortalama >=50 )? "gectiniz" : "kaldiniz";
        System.out.println(sonuc);


    }
}

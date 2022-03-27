package day19_doWhıleLoop;

import org.w3c.dom.ls.LSOutput;

public class C05_Scope {

    // 1- bir method icerisinde olusturulan variable'lar sadece olusturulduklari
    //methodda kulanilabilirler, baska methodlarda kullanilamazlar
    // 2- tum methodlarin kullanilabilmesini istedigimiz variablelari
    // class level da olustururuz
    // class levelda olusturdugumuz variablei
    // ---statik yaparsak tum methodlar kullanabilir
    // --- static olmazsa (instance) o zaman sadece static olmayan methodlar kullanilabilir
    // 3- loop icinde olusturulan variablelar loop icerisinde kullanilabilir
    // ama loopun disinda kullanilamaz

     static String kurs= "Java";
     int level=10;
     static int sayi4;


    public static void main(String[] args) {
        int sayi=10;
        // isim="Vali Yan";
        System.out.println(kurs);
       // System.out.println(level);
        for (int i = 0; i <10; i++) {
            System.out.println(i);
            int loopSayi=20;

            int sayi2;

            sayi4++; // class seviyesinde olusturup deger atamadigim sayi 4 ' u artirmama java itiraz etmiyor
           // sayi2++; // ama main method icinde olusturup deger atamadigim sayiyi artirmama java izin vermiyo

        }



    }
    public static void method1(){
       String isim= "Ali Can";
       //sayi=20;
        System.out.println(kurs);
    }
    public void method2() {
        //sayi=30;
        System.out.println(kurs);
        System.out.println(level);
    }

}

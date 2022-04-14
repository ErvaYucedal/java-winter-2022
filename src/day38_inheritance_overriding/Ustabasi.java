package day38_inheritance_overriding;

import javax.swing.*;

public class Ustabasi extends Isci {

    String statu="Ustabasi";
    String haklar="ustabasi haftada birgun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("ariza varsa ustabasi ekstra ucret almadan calisir");

    }
    public void maasHesapla(){
        System.out.println("tum personel 30 gun * 8 saat* 12 euro=" + (30*8*12) + "euro maas");


    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz classtan klasik haliiyle bir obje olusturursak
        o obje ile cagirdigimiz varible ve methodlarda
        Java once icinde bulundugumuz class'a bakar
        aradigimiz class uyesi, icinde oldugumuz class'da varsa
        bize onu getirir
        YOKSA,
        parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); //ustabasi
        System.out.println(yasin.haklar); //ustabasi haftada birgun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); //Isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); //tum personel yilda 4 hafta izin kullanabilir

        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini(data turunu) isci seceriz
         */

       Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu); //isci
        System.out.println(ahmet.haklar); //Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); //Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); //tum personel yilda 4 hafta izin kullanabilir

        /*
        siz bir objeyi hangi classdan tanimlarsaniz o class a ait ozelliklere sahip olur
         */
        Personel adem=new Ustabasi();
        System.out.println(adem.statu); //personel
        System.out.println(adem.haklar); //tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye); //CTE verir
        System.out.println(adem.izin); //tum personel yilda 4 hafta izin kullanabilir

        /*
        Personel adem=new Ustabasi(); bu bir ustabasi objesidir
        Personel adem=new Personel(); bu personel objesidir
                 */

        /*
            Personel adem=new Ustabasi();

            adem'in data turu Personel'dir.
            boylece biz adem'i ne olarak isimlendirdigimizi bilebiriz.
            Ancak ben Ademin ustabasi oldugunu biliyorum
            cunku constructor'i ustabasi ama
            bu yazim formati ile adem'in tum personel ile birlikte sahip oldugu
            ortak ozelliklerini vurgulamak istiyorum

            Bu kullanim seklinde olusturulan obje data turu olarak secilen class
            ve onun parent classlarindaki variablelari kullanabilir
         */



    }
}

package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {

        //sinif listesini duzenli bir sekilde yazdirmak
       Map<Integer, String > sinif= MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);

    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("numara isim soyisim brans");
        System.out.println("=========================");

        //Map yapisinda yazdirdigimiz kullanicilar bir sey anlamayabilir
        //bunun icin once map yapisini kodlarla manipule edip
        //map'deeki datalari , istedigimiz formata sokmamiz gerekir
        //1.adim key ve value'lari map'den alip
        //iki farkli collection uyesine atadik

        Set<Integer>KeySet=sinif.keySet();
        Collection<String > valueSet=sinif.values();

        System.out.println(KeySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each:valueSet
             ) {
            System.out.println(each);

        }
    }


}

package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim

       Map<Integer, String > sinifListMap=MapOlustur.myMap();
        System.out.println(sinifListMap);

        //Eger key'Lere tek tek ulasmak istersek
        //index yapisina ihtiyacimiz var
        //ancak map index yapisini desteklemez
        //bunun icin keyleri once bir set'e
        //sonra da set'in tum elementlerini bir list' e ekledik

        Set<Integer> sinifKeySeti=sinifListMap.keySet();

        List<Integer> keyList= new ArrayList<>();
        keyList.addAll(sinifKeySeti);

        //simdi de value'Leri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String>sinifValueColl =sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);

        /*value birden fazla bilgiyi iceriyor
        onun icin value'leri multidimensional bir array'e atmak mantikli duruyor
        ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var
         */

        int outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut);

        //inner arraylerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue= sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(",");
        int innerArrayBoyut=ilkValueArray.length;


        String valueMDAarr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDAarr[i][j]=temp[j];




            }

        }



    }







    }


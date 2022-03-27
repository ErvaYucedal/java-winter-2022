package day25_Lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //verilen bir arrayden stenen elementi(kac tane varsa) silip , kalanlari
        // yeni bir array olarak yazdiran bir method olusturun
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElemaniSil(arr, istenmeyenEleman);
        
        
    }

    private static void istenmeyenElemaniSil(int[] arr, int istenmeyenEleman) {

        // 1- istenmeyen element sayisini bulalim
        int sayac= 0;
        for (int i=0 ; i< arr.length; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;

            }
        }

        // yeni arrayi olusturalim
        int arrYeni[]=new int[arr.length-sayac];
        // eski arrayden uygun elementleri yeniye tasi
        int index=0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;

                

            }
        }

        // yeni array i yazdiralim
        System.out.println(Arrays.toString(arrYeni));
    }
}

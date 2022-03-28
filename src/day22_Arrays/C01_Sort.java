package day22_Arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "Y"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // Java da bu siralamaya Natural Order denir
        //sayi olursa kucukten buyuge
        //metin olursa alfabetik siralamaya gore
    }
}
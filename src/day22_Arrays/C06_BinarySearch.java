package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 5;


        //eger javadan hazir BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanip, sonra binarySearch yapabiliriz
        // binarySearch () bize istenen sayinin oldugu indexi verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); //8

        //eger olmayan bir elementi aratirsak
        //Java bulamadigini gostermek icin - isareti koyar
        //sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir



    }
}

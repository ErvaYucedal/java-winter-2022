package day25_Lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        //verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};
        List<String> arraydenLlist=Arrays.asList(arr);

       // arraydenLlist.add("J");
        System.out.println("19. satirda list:" + arraydenLlist);
        arr[1]="F";
        System.out.println("23.satirda Array: " + Arrays.toString(arr));
        System.out.println("24. satirda Array:" + arraydenLlist);
        arraydenLlist.set(0,"Y");

        System.out.println("28.satirda Array: " + Arrays.toString(arr));
        System.out.println("29. satirda Array:" + arraydenLlist);



    }
}

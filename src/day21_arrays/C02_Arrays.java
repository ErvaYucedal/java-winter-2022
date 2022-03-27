package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        String arr1[]={"Ali", "Veli", "Ayse"};
        // array icindeki elementlere ulasabilmek icin index kullaniriz
        System.out.println(arr1[0]); //Ali

        arr1[1]="Esila" ;
        System.out.println(arr1[1]); // Esila

        //arrayin icinedki indexi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int [4];

        System.out.println(arr2[1]);
        System.out.println(arr2[3]);
       // System.out.println(arr2[5]);

        //arrayin tamamini yazdirmak istersek

        System.out.println(arr2); //[I@27f674d
                                  // arrayler non-primitive olduklarindan direkt yazdirmak istersek
                                  // java referans bilgisini yazdirir

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        // array i yazdirmak icin javadaki arrays classindan toString () kullanilir

        System.out.println(Arrays.toString(arr2));

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));  //[0,11,0,22]

        System.out.println(Arrays.toString(arr1)); // [Ali, Esila, Ayse]






    }
}

package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementlerinArttirma {
    public static void main(String[] args) {

        //verilen listedeki her elementi 3 artirin

        List<Integer> Liste=new ArrayList<>();

        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);
        System.out.println(Liste); //[5, 7, 8, 6, 9]

        /*listenin tum elementlerini bize getirmesi icin
        iterator'un hasNext() ve next () methodlarini kullanacagiz
         */
        ListIterator itr=Liste.listIterator();
        while(itr.hasNext()){   //yaninda element oldugu muddetce calisacak

            Object sayi=itr.next();
            itr.set((Integer)sayi+3);
        }
        System.out.println(Liste);

    }
}

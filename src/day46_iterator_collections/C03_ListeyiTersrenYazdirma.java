package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

public class C03_ListeyiTersrenYazdirma {
    //verilen bir listeyi, iterator ile sondan başa dogru yazdiralim

    public static void main(String[] args) {


        List<Integer> Liste=new ArrayList<>();

        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);

        //once iterator'u olusturup, sona yollayalim
        ListIterator itr=Liste.listIterator();
        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous() + " ");
        }
    }
}

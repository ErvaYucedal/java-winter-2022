package day45_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> Liste=new ArrayList<>();

        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);
        System.out.println(Liste); //[5, 7, 8, 6, 9]

        //for each kullanarak her elemnti 2 arttiralim

        for (Integer each:Liste
             ) {
each=each+2;
        }
        System.out.println(Liste);

        Iterator itr= Liste.iterator();
    }
}

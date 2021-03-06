package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedLİst {
    public static void main(String[] args) {
        /*
        LinkedList'in 2 tane parent Interface'i vardir
        LinkedList olustururken data turu olarak;
        LinkedList secersek: iki parentdaki tum methodlar
        List secersek: sadece List Interface'indeki methodlar
        Deque/Queue secersek: Deque'deki methodlari kullanabiliriz
          */

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);//Linkedlist

        //sadece list interface'inden ozellikler kullanmak istersek
        List<Integer> ll2= new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);
        // sadece Deque'den gelen ozellikleri kullanalim
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);
        ll3.addLast(40);
        System.out.println(ll3);


    }


}

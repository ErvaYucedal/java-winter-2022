package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
// hem list hem de Queue'nun child classidir
        LinkedList<Integer>list=new LinkedList<>();
        list.add(5);
        list.add(10); // add method'u list'ten geldigi icin hem sona ekler
        list.addFirst(11); //addFirst deque'den gelir
        list.addLast(12); //addLast deque'den gelir

        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
    }
}

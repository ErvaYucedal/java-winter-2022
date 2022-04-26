package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {

        List<Integer> Liste=new ArrayList<>();

        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);
        System.out.println(Liste); //[5, 7, 8, 6, 9]


        Iterator itr=Liste.iterator(); //iterator methodunu olusturdugumuz liste objesi
                                       // uzerinden ArrayList classindan calistiriyoruz

        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
         Iterator itr=Liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde
        calismak icin olusturmus olduk
        Biz iterator objesini olusturdugumuzda,
        iterator collection'in ilk elementinin oncesine gidip bekler
        [5, 7, 8, 6, 9]

        itr.hasNext() ==> true  iterator 'a yaninda eleman var mi diye sorar, true veya false dondurur

        itr. next(); ==> iterator bir sonraki elementin yanina gecer ve uzerinden gectigi elementi bize dondurur

         itr.remove(); //iterator un elinde olan elementi sildi
         dolayisiyla ust uste iki kere itr. remove (); KULLANILAMAZ

         once itr.next(); methodunu calistirip
         iterator'in bir element olmasini saglamaliyiz
                 */
        System.out.println( itr.hasNext());
        System.out.println(itr.next()); //5
        System.out.println(itr.next()); //7
        System.out.println(itr.next()); //8
        itr.remove(); //
        System.out.println(Liste);





    }
}

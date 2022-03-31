package day30_passByValue;

import jdk.swing.interop.SwingInterOpUtils;

public class C01_StaticBlocks {

    static{
        /*
        static block class ilk calismaya basladiginda devreye girer
        ve classin calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hhicbir onemi yoktur, class icerisinde istenen yerde yazilabilir


         */
        System.out.println("static blok calistirir");
    }

    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
    }
}

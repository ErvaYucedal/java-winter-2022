package day10_switch_StringManipulation;

import java.nio.charset.StandardCharsets;

public class C04_CharAt {
    public static void main(String[] args) {
        //Stringte herhangi bir harfi alamak istedigimizde
        //o harfin index'ini kullanarak
        //str.charAt(istenenIndex) yazabiliriz
        String str="Java Cok Guzel";
        //Jyi yzdiralim
        System.out.println(str.charAt(0));
        //g yi yazfiralim
        System.out.println(str.charAt(9));
        //va yazdiralim
        System.out.println(""+str.charAt(2)+ str.charAt(3));

        //cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        //son karakteri yazdir
        //Stringde 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1));
    }
}

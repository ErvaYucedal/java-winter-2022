package day15_methodCreation;

import day12_stringManipulation.C01_indexOf;
import day12_stringManipulation.C06_replaceAll;
import day17_forLoop.C04_ForLoop;

public class C06_MethodCreat {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //ıkı varıablenın deerlerını toplayan bır metod olusturalm
        //1.adım: metodd adını yazalım
        //2.adım : metjod a ormemem errekn
        ikiSayiTopla(25,6);

    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verlen k saynn toplam:" + (a+b));

    }

}

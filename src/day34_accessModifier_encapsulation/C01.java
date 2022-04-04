package day34_accessModifier_encapsulation;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static  int acikSayi=20; //access modifier'i default olur
    String acikString="Hi"; //access modifier'i default olur
    public static int halkaAcikSAYİ=13;

    protected static int aileyeOzel=40;


    protected C01(){
    }
    // bu constructorin access modifieri
    //default access modifierdir
    //dolayısıyla icinde oldugumuz paketin disinda
    //bu classdan obje olusturulamaz

    C01(int numara ){
        System.out.println("parametreli");

    }
    private void method1(){

    }
}

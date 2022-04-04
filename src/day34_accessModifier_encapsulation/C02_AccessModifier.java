package day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj=new C01();

        obj.acikString= "Bye";
        C01.acikSayi=50;
        //C01.sayi=15; private access modifier'i oldugundan baska classtan erisilemez

        //obj.method1; private access modifier i olduundan baska classdan erisilemez

        C01 objParametreli=new C01(5);



    }
}

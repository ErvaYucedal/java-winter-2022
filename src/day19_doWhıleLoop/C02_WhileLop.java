package day19_doWhıleLoop;

public class C02_WhileLop {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve
        //bu sayinin rakamlari toplamini yazdirin

        int input= 6569;
        int rakam=0;
        int rakamlarToplami=0;
        while(input>0){
            rakam=input%10;
            rakamlarToplami += rakam;
            input /=10;
        }
        System.out.println(rakamlarToplami);
    }
}

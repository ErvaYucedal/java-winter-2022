package day05_matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayi1= 20;
        Short sayi2=30;
        sayi1=sayi2;
        //wrapper class ile ayni isimdeki primitive data turu arasinda gecis olabilir
        System.out.println(sayi1);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES); // 2Byte=16 bit



    }
}

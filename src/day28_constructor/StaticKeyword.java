package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        System.out.println("sayi1 : " + sayi1); //0
        //System.out.println("sayi1 : " + sayi2); static olmadigi icin main methoddan direkt kullanamayiz

        StaticKeyword obj1=new StaticKeyword();

        System.out.println(obj1.sayi2); //0

    sayi1++;
    obj1.sayi2++;
        System.out.println("sayi1: " + sayi1);
        System.out.println(obj1.sayi2);
        System.out.println(obj1.sayi1);

        StaticKeyword obj2= new StaticKeyword();
        System.out.println(obj2.sayi2); // 0
        System.out.println(obj2.sayi1); //

}}

package day15_methodCreation;

public class C07_MetodCreaton {
    public static void main(String[] args) {

        //hosgeldiniz diyen method olusturunhosgeldinYazdir();
        //kapanma mesaji yazan bir method olustur
        hosgeldinYazdir();
    }
    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }
    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur");
    }
    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}

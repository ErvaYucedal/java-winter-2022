public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5)); //

        //yukaridaki string i kullanarak mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca" + str.substring(5));
        System.out.println(str.substring(9));
        //eger bir index'ten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring (baslangicIndexi, bitisIndexi)
        //baslangic indexi==> inclusive/dahil
        //bitis indexi==> eclusive /haric
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(5,6));
        String harf=str.substring(5,6);
        System.out.println(harf);
        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));

        //System.out.println(str.substring(5,2)); //bitis index'i baslangic indexinden kucuk olamaz
        System.out.println(str.substring(str.length()-1));// son harfi verir
        System.out.println(str.substring(str.length()-5));

        System.out.println(str.substring(str.length())); //son harften sonraki kısmı hiçlik verir








    }
}

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {

        int level=1;
        System.out.println(level);
        boolean ogrenciMi=true;
        boolean yagisVarmi=false;
        System.out.println(ogrenciMi);
        System.out.println(yagisVarmi);

        char ozelSembol='½';
        System.out.println(ozelSembol);
        char sayi='1';
        System.out.println(1);

        String ogrenciIsmi= "Melih";
        ogrenciIsmi="Furkan";
        System.out.println(ogrenciIsmi);

        String isim, soyisim, dogumYeri;
        isim="Nihad";
        soyisim="Elmas";
        dogumYeri="Adana";

        System.out.println(dogumYeri);
        System.out.println(soyisim );
        System.out.println(isim);
        String tcNo="123546481";
        System.out.println(tcNo);
        String hiclik="";
        System.out.println(hiclik);

          /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
        int sayi1= 10;
        int sayi2= 20;

        System.out.println("Swap'dan once sayi1: " + sayi1 + " sayi2 :"  + sayi2);

        int temp= sayi1;
        sayi1= sayi2;
        sayi2=temp;
        System.out.println("swap'den sonra sayi1: " + sayi1 + ", sayi2 : " + sayi2);


        int sayi5=10, sayi6=40;
        System.out.println(sayi5+sayi6);

        String isim1="Erva";
        String soyisim1="Yücedal";
        System.out.println(isim1 +" "+  soyisim1);
        System.out.println("isminiz:" +isim1);
        System.out.println("soyisminiz: " + soyisim1);
        System.out.println(("isminiz: " + isim1 )+(" soyisminiz: " + soyisim1));

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
       short sayi8=30;
       double sayi9=40;
        System.out.println(sayi8+sayi9);

        char ozelIsaret='=';
        System.out.println(ozelIsaret);
        int sayi12=58;
        char karakter='a';
        System.out.println(sayi12+karakter);

       // Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("girdiginiz yaricap:" + yaricap);
        System.out.println("cemberin cevresi:" + 2*3.14*yaricap);
        System.out.println("dairenin alani:" + 3.14*yaricap*yaricap);

        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //      Isim – soyisim : Mehmet Bulutluoz

        Scanner scan1= new Scanner(System.in);
        System.out.println("İsminizi yaziniz:");
        String isim43=scan.nextLine();
        System.out.println("soyisminzii yaziniz");
        String soyisim2=scan.nextLine();
        System.out.println("isim-soyisim:" + isim43 +soyisim2);






    }
}

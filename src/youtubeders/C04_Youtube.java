package youtubeders;

public class C04_Youtube {
    public static void main(String[] args) {

        char a= 'm';
        String str= "Hello Word";
        System.out.println(str);
        String metin= "Hello Word";
        System.out.println("15+20");

        int b=10;
        int c=5;
        int toplam= b+c;
        int cikarma= b-c;
        int carpma= b*c;
        int bolme= b/c;
        int mod= b%c;

        System.out.println("toplama:" + toplam);
        System.out.println("cikarma:" + cikarma);
        System.out.println("carpma:" + carpma);
        System.out.println("bolme:" + bolme);
        System.out.println("mod: " + mod);
        toplam++;
        System.out.println(toplam);
        cikarma--;
        System.out.println(cikarma);

        int sonuc= b++ + c--;
        System.out.println(sonuc);
        System.out.println(b);

        int sayi1=10;
        int sayi2=5;
        boolean kosul= (sayi1/sayi2)==2;
        System.out.println(kosul);
        boolean kosul1= (sayi1>sayi2);
        boolean kosul2= (sayi2>sayi1);
        boolean sonuc2= kosul1 && kosul2;
        System.out.println(sonuc2);
        sonuc2 = kosul1 || kosul2;
        System.out.println(sonuc2);

        String sonuc3= (kosul1)? "dogru" : "yanlıs";
        System.out.println(sonuc3);

        sayi1= sayi2;
        System.out.println(sayi1);
        sayi1= sayi1+2;
        sayi1+=2;
        System.out.println(sayi1);









    }
}

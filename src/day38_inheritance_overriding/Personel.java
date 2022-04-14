package day38_inheritance_overriding;

public class Personel {

   public String statu="Personal";
    public String haklar="Tum personel esit haklara sahiptir";
    public String izin="tum personel yilda 4 hafta izin kullanabilir";

    public void mesai(){
        System.out.println("tum personel 5 gun, gunde 8 saat calisir");

    }
    public void maasHesapla(){
        System.out.println("tum personel 30 gun * 8 saat* 10 euro=" + (30*8*10) + "euro maas");
    }

}

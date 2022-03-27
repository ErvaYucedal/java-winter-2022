package day20_scope_Arrays;

public class C02_StaticVariables {

    //instance variable'lar obje'ye baglidir ve her obje farkli degerler alabilir
    //ogrenci notlari veya ogretmen branslari gibi
    // bir objeye ait bir variablenin son degerini bulmak icin sadece o objeyi dikkate aliriz

    // static variabler ise class variable olarak tanimlanir
    //tum class uyeleri icin aynidir. okul ismi, okul mudurunun adi gibi
    //eger static variablenin degeri degistirilirse herkes icin degisir

    static String okulIsmi="Yildiz Koleji";
   static int okulNo;
  static   boolean okulAcikMi;



    public static void main(String[] args) {
        System.out.println(okulIsmi); //Yildiz Koleji
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

        staticMethod();

        System.out.println(okulNo);



    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);
    }
}

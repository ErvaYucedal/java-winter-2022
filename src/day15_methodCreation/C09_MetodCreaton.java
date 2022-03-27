package day15_methodCreation;

public class C09_MetodCreaton {
    public static void main(String[] args) {

        String isim= "akif";
        String soyisim= "YÜCEDAL";
        String kKno="1234567890123456";

        //eger bir methoddan bir islem yapmasini
        //ve yaptigi islemi bize getirmesini isterseniz
        //return type void degil, bize getirecegi sonucun data turunde olmalidir

        String gizlenmisIsimSoyisimGizle=isimSoyisimGizle(isim,soyisim);
        //bana isim
        System.out.println(gizlenmisIsimSoyisimGizle);
        String gizlenmisKKNo= krediKartiGizle(kKno);
        System.out.println(gizlenmisKKNo);

    }
    private static String krediKartiGizle(String kKno) {
        String yenikKNo= "**** **** **** " + kKno.substring(12);
        return yenikKNo;
    }
    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S" , "*");
        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S" , "*");
        return yeniIsim+" "+yeniSoyisim;


    }
}


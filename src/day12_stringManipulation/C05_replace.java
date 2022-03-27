package day12_stringManipulation;public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        // bu cumlede bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi: " + str.replace(" ", "").length());
        System.out.println("orjinal str karakter sayisi:" + str.length());

        // str da kalici degisiklik yapalim
        // bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun", "yarin");
        str= str.replace("ogrendik","ogrenecegiz");
        System.out.println( "kalici degisiklikten sonra: " + str
        );
        str.replace("ne cok", "ne az");
        System.out.println(str);
    }
}

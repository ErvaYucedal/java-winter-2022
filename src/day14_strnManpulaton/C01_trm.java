package day14_strnManpulaton;

public class C01_trm {
    public static void main(String[] args) {

        String str="    Siz ne derseniz deyin, Java bildigini okur   ";

        str.trim();
        System.out.println(str);
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());


    }
}

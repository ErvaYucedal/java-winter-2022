package day05_matematikselislemler;

public class C01_PreincrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println("pre-incrementten once" + sayi);

        System.out.println("pre-increment satirinda " +  ++sayi);
        System.out.println("pre-incremenetten sonra" + sayi);

        System.out.println("post-increment satirinda" + sayi++);
        System.out.println("post icrement satirindan sonra"+ sayi);


    }
}

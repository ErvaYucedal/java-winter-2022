package day19_doWhıleLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tamsayi alip while loop ile sayidan kucuk pozitif sayilari yazdiralim

        int input=3;

        int sayi=1;


        sayi=1;
        do {System.out.println(sayi);
            sayi++;

        } while (sayi<input);

    }
}

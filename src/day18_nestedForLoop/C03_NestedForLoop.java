package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        //soru 12)  kullanicidan pozitif bir rakam girmesini isteyin
        // *
        // * *
        // * * *
        // * * * *
        int input= 5;

        for (int i = 1; i <=input ; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
}

package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        //kullanicidan bir String isteyin.
        // Kullanicidan girdigi String 'in palindrome olup olmadigini kontrol eden bir method olusturun

        String input= "mada";
        palindromeKontrolEt(input);


    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);


        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi:" + terstenInput);
        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime palindrome");

        }
        else{
            System.out.println("girdiginiz kelime palindrome degil");
        }

    }
}

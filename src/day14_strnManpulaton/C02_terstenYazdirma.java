package day14_strnManpulaton;

public class C02_terstenYazdirma {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String input="Erva";
        String tersStr=input.substring(3).toUpperCase()+
        input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);




    }
}

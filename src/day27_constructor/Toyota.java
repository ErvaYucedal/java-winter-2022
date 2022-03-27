package day27_constructor;

public class Toyota {

   String  marka= "Toyota";
   int tekerAdedi= 4;
   boolean motoruVarMi= true;
    String model ;
    String yakit;
    int yil;



    public void maxHiz() {
        if (yakit.equals("benzin")){
            System.out.println("benzinli araba");

        } else if (yakit.equals("dizel")) {
            System.out.println("dizel araba");
        }
    }
    public void renkTercihleri (){

        if (model.equals("Corolla")) {
            System.out.println("corolla renk secenekleri kirmizi ve beyaz");
        } else if (model.equals("yaris")) {
            System.out.println("yaris renk secenekleri sari ve lacivert");
        }
    }
}

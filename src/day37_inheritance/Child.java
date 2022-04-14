package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
//bir class'i child class yaptigimizda
    // parent classdaki constructor'a ulasmasi gerekir
    //bu durumda parent classdaki constructor'in
    //access modifier'i uygun bir modifier yapilmalidir


    Child(){
        super();
        System.out.println("child class parametresiz cons");

    }
    Child (int s){
        //Child class'da tum constructor'larin ilk satirina
        //Javanin yerlestirdigi constructor PARAMETRESİZdir yani
        // super()
        System.out.println("child class parametreli cons.");
    }

    Child (int sayi1, int sayi2) {
        //eger parent class'dan parametresiz constructor'i degil de
        //baska bir constructor'i calistirmak isterseniz
        //bunu Child class'daki constructor'in İLK SATIRINA yazmalisiniz.
        super(sayi1,sayi2);
        System.out.println(" child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);

    }

    }


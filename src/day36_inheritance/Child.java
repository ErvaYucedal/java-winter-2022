package day36_inheritance;

public class Child extends Parent {
    Child(){
        super();
        System.out.println("Child cons. calisti");}

    //tum classlarda biz gormesek bile
    //Javanın olusturdugu default constructor vardır

    //Extends keyword kullanan classlardaki
    //  Tum CONSTRUCTOR'larin ilk satirinda
    // biz gormesek bile super()
    //constructor call vardır
    // yani parent class'in parametresiz constructor call


    public static void main(String[] args) {
        Child child=new Child();

    }
}

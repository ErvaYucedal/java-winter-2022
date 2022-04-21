package day45_interfaces;

public class C02_Default_Static_Method implements  I01_Default_Static{

    /*
    Bir interface'de default veya static olarak tanimlanan ve body'si
    olan methodlarin override edilmesi mecburi DEGİLDİR
    Eger static olarak tanimlanmışsa zaten override edemeyiz
     */


    @Override
    public void method1() {
        System.out.println("child class method1");

    }
    /*
    Parent ınterfacedeki default olarak tanimlanan method'u istersek
    override ederiz istersek etmeyiz
    override etmezsek, method cagrildiginda Parent Interfacedeki calisir
    override edersek, child classdaki overriding method calisir
        @Override
    public void method2() {
        I01_Default_Static.super.method2();
    }
     */



    //Interface'deki static olarak tanimlanan methodlara
    //static yontemlerle ulasilabilir InterfaceIsmi.methodIsmi.

    public static void main(String[] args) {
        I01_Default_Static.method3();

        C02_Default_Static_Method obj= new C02_Default_Static_Method();
        obj.method1(); //Child class
        obj.method2();//parent ınterface
        //obj.method3(); eski classlarda static bir uyeye
        // static olmayan yollarla da ulasabilirdik
        // ancak interface icerisinde static olarak tanimlanan method'a
        //static olmayan yontemlerle ulasilamaz

    }
}

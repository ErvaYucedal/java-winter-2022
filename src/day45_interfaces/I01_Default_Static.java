package day45_interfaces;

public interface I01_Default_Static {

    /*
    Interface'lerde sadece abstract methodlar bulunur
    body'si olan concrete bir method olusturmak istedigimizde Jaca CTE verir

    Ancak Java8 ve uzeri versiyonlarda, istisnai olarak
    static veya default olarak tanimlanan methodlarin body'si olabilir
    ancak burada kullanilan default keyword'u access modifier degildir
    cunku Interface'lerde tum methodlar public ve abstract'ti

    asagidaki ornekte gorulecegi gibi default olarak tanimlanmiş
    bir method'a access modifier olarak public yazabilirsiniz
    (access modifier yazmasak da Java method'u public olarak kabul edecektir
     */

    void method1();
   public default void method2(){
       System.out.println("Interface'deki default method");
   }
   static void method3(){
       System.out.println("Interfacedeki static method");
   }
}

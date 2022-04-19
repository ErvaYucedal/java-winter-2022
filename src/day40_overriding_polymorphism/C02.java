package day40_overriding_polymorphism;

public class C02 extends C01{



 private void method4(){
    System.out.println("Parent method4");
     // parent classdaki private method 4'e
     //child classtan ulasmamiz mumkun olmadigindan
     //java bu iki method 'u
     //TAMAMEN FARKLI İKİ METHOD olarak kabul eder
     //@Override kullanmak istersek Java kabul etmez CTE verir
}
@Override
    protected String method3() {
    return "Java";

}
    @Override
    public void method2() {
        /*
            @Override notasyonu overridden method ile overriding method'u
            birbirine baglar
            Farkinda olunmadan overriden method silinirse veya signature degistirilirse
            bu iliski bozulacagi icin Java CTE verir
            Notasyon kullanilmazsa Java bunlari iliskisini bilir ama overridden
            method silinirse sesini cikarmaz

         */
        System.out.println("Child method2  ");
    }

    public static void main(String[] args) {
        C02 obj=new C02();

        obj.method1(); //parent method1
        obj.method2(); //Child method2

       C01 obj2= new C02();
       obj2.method1(); //parent method1
        obj2.method2();//Child method2

        C01 obj3= new C01();
        obj3.method1(); //parent method 1
        obj3.method2(); //parent method2


    }
}

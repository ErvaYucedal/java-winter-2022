package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    bir abstract class'da abstract veya concrete methodlar bulunabilir
    Child classların abstract methodları override etmesi MECBURİ iken
    concrete methodların override edilmesi OPSIYONEL dir.
     */

    public abstract void absmethod();

     public void concreteMethod(){
         System.out.println("CO4 concrete method");
     }
    public static void concreteStaticMethod(){
        System.out.println("CO4 concrete static method");
    }

    public static void main(String[] args) {
         /*
         Abstract classlar constructor 'a sahiptir
         ancak Abstract classlardan OBJE OLUSTURULAMAZ

         Abstract classlar OBJE BARINDIRMAYAN,
         sadece child classlar icin
         UYULMASİ SART OLAN veya OPSIYONEL birakilan
         ozellikleri tanimladigimiz bir depo class gibidir
          */

       // CO4 obj=new CO4();
        System.out.println("bu class abstract");
        concreteStaticMethod();
    }
}

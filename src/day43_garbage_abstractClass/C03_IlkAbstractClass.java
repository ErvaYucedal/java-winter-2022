package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractMethod();

    /*
    Abstract methodlar
    child classlarin MUTLAKA override etmesi gereken methodlardir
    dolayisiyla HİCBİR ZAMAN direk calistirilmazlar
    ve bu sebeple method bodysine ihtiyac yoktur


    bir classin veya methodun abstract olup olmadigini anlayabilir miyiz?
    -abstract yaziyorsa abstractir, yazmiyorsa degildir.
    (abstract olmayan classlara concrete class /method denir)

    Abstract methodlar body'e sahip olamaz
    Concrete methodlar ise method bodysi olmadan olusturulamaz
     */

}

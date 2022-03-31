package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now(); //objenin olusturuldugu tarihi trh'ye atar
        LocalDate baskaTrh= LocalDate.of(1996,1,23);
        //istedigimiz yil , ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh);
        // get'li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); //31
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());

        //bir tarihten istedigimiz kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.plusWeeks(20));

        System.out.println(trh.plusMonths(9).plusDays(10));


        }


}

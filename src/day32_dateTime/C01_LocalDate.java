package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

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

        //istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone=LocalDate.now(ZoneId.of("Asia"));
        System.out.println(trhZone);

        //is ile baslayan methodlar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); //false
        System.out.println(trh.isAfter(baskaTrh)); //true
        }


}

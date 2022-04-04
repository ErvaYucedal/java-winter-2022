package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1996,01,23);
        System.out.println(Period.between(dogumGunu,bugun)); //P26Y2M11D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); //26

        // FIXME: 3.04.2022

    }
}

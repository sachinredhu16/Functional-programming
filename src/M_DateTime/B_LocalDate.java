package M_DateTime;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class B_LocalDate {

    public static void main(String[] args) {
        // basic LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2018,12,12);
        System.out.println(localDate1);

        System.out.println("Year is : "+localDate.getYear());
        System.out.println("Month is : "+localDate.getMonth());
        System.out.println("Month Value is : "+localDate.getMonthValue());
        System.out.println("Date is : "+localDate.getDayOfMonth());

        System.out.println("Day of Month using get : "+localDate.get(ChronoField.DAY_OF_MONTH));

        // Increment the Date

        System.out.println("2 days plus :  "+localDate.plusDays(2));
        System.out.println("2 Months plus :  "+localDate.plusMonths(2));

        System.out.println("2 days minus :  "+localDate.minusDays(2));
        System.out.println("2 Months minus :  "+localDate.minusMonths(2));
        System.out.println("Minus using ChronoUnit : "+localDate.minus(1, ChronoUnit.MONTHS));

        System.out.println("with Year : "+localDate.withYear(2020));

        System.out.println("with ChronoField : "+localDate.with(ChronoField.YEAR,2020));

        System.out.println("TemporalAdjusters : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        // Additional functions

        System.out.println("check Leap year : "+localDate.isLeapYear());
        System.out.println("Is equal : "+localDate.isEqual(LocalDate.now()));
        System.out.println("Is before : "+localDate.isAfter(    LocalDate.now().minusMonths(1)));

        // unSupported
//        System.out.println("Date with time : "+localDate.minus(1,ChronoUnit.MINUTES));
        System.out.println("isSupported : "+localDate.isSupported(ChronoUnit.MINUTES));
    }
}

package M_DateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class D_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(
                2012,12,12,12,12,12,200);
        System.out.println("Manual dateTime : "+localDateTime1);

        // Getting time and date from localDateTime
        System.out.println("Hour is : "+localDateTime.getHour());
        System.out.println("Date is : "+localDateTime.getDayOfMonth());
        System.out.println("Year is : "+localDateTime.getYear());
        System.out.println("Year using ChronoField : "+localDateTime.get(ChronoField.YEAR));

        // changing the LocalDateTime
        System.out.println("Adding 2 hours : "+localDateTime.plusHours(2));
        System.out.println("Adding 2 days : "+localDateTime.plusDays(2));

        System.out.println("Minus 2 month : "+localDateTime.minusMonths(2));
        System.out.println("Minus 2 days : "+localDateTime.minusDays(2));

        System.out.println("with year : "+localDateTime.with(ChronoField.YEAR,2020));
        System.out.println("with Month : "+localDateTime.with(ChronoField.MONTH_OF_YEAR,12));


    }
}

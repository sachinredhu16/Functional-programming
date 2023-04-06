package M_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class F_Period {
    public static void main(String[] args) {
        // Period is a Date-based representation of Time
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withDayOfMonth(20);

        Period period = Period.between(localDate,localDate1);
        Period period1 = localDate.until(localDate1);
        System.out.println(period.getDays()+" || "+period1.getDays());

        // creating Period
        Period period2 = Period.ofDays(10);
        System.out.println("Period days : "+period2.getDays());

        System.out.println("toTotalMonths : "+Period.ofYears(10).toTotalMonths());
    }
}

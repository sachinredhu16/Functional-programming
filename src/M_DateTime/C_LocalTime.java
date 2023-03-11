package M_DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class C_LocalTime {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : "+localTime);

        // creating LocalTime
        System.out.println("LocalTime : "+LocalTime.of(13,13));
        System.out.println("LocalTime : "+LocalTime.of(13,13,13));
        System.out.println("LocalTime : "+LocalTime.of(13,13,13,3465));

        System.out.println("Hour is : "+localTime.getHour());
        System.out.println("Minutes is : "+localTime.getMinute());
        System.out.println("Seconds is : "+localTime.getSecond());

        System.out.println("Hour using temporal : "+localTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Day in Seconds : "+localTime.toSecondOfDay());

        // modifying the LocalTime
        System.out.println("Adding 20 Min "+localTime.plusMinutes(30));
        System.out.println("Using ChronoUnit : "+localTime.plus(30, ChronoUnit.MINUTES));

        System.out.println("with : "+localTime.withHour(2));
        System.out.println("with MIDNIGHT  : "+localTime.with(LocalTime.MIDNIGHT));
    }
}

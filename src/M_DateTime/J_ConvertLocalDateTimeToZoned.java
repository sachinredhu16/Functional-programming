package M_DateTime;

import java.time.*;

public class J_ConvertLocalDateTimeToZoned {
    public static void main(String[] args) {

        // LocalDateTime -->> ZonedDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        System.out.println("zonedDateTime  : "+ zonedDateTime);

        // Instant -->> ZonedDateTime
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.systemDefault());
        System.out.println("zonedDateTime1 : "+zonedDateTime1);
    }
}

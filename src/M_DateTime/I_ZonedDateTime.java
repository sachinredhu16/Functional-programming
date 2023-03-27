package M_DateTime;

import java.time.*;

public class I_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : "+zonedDateTime);

        System.out.println("Zone offSet : "+zonedDateTime.getOffset());
        System.out.println("Zone id : "+zonedDateTime.getZone());

//        System.out.println("Available Zones is :"+ ZoneId.getAvailableZoneIds());

//        ZoneId.getAvailableZoneIds().stream()
//                .forEach(System.out::println);

        System.out.println("No of zones : "+ZoneId.getAvailableZoneIds().size());

        // .now(ZoneId zone)
        System.out.println("CST    : "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("LA PST : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));

        // .now(Clock clock)
        System.out.println("CST    : "+ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));
        System.out.println("LA PST : "+ZonedDateTime.now(Clock.system(ZoneId.of("America/Los_Angeles"))));

        // creating LocalDateTime using ZoneId
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println(localDateTime2);
    }
}

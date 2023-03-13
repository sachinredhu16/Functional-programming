package M_DateTime;

import java.time.Duration;
import java.time.Instant;

public class H_Instant {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);
        // Jan 1st 1970 -> EPOCH - 86400 every year
        System.out.println(instant.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant,instant1);
        System.out.println("diff in sec : "+duration.getSeconds());
        System.out.println("diff in nano sec : "+duration.getNano());
    }
}

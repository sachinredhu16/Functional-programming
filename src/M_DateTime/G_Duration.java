package M_DateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class G_Duration {
    public static void main(String[] args) {
        // Duration is compatible with LocalTime and LocalDateTime

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(1);

        Duration duration = Duration.between(localTime,localTime1);
        long duration1 = localTime.until(localTime1,ChronoUnit.HOURS);
        System.out.println("Duration : "+duration.toHours());
        System.out.println("Duration hours is : "+ duration1);

        Duration duration2 = Duration.ofHours(10);
        System.out.println("duration2 : "+ duration2.toHours());
    }
}

package M_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class E_Converting {
    public static void main(String[] args) {
        // converting localDateTime to localDate and localTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : "+localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDate+" || "+localTime);

        // converting localDate and localTime to localDateTime
        LocalTime localTime1 = LocalTime.now();
        LocalDateTime localDateTime1 = localTime1.atDate(LocalDate.of(2020,10,10));

        LocalDate localDate1 = LocalDate.now();
        LocalDateTime localDateTime2 = localDate1.atTime(20,20,20,20000);

        System.out.println(localDateTime1+" || "+localDateTime2);



    }
}

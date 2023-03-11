package M_DateTime;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A_BasicDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate is : "+localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime is : "+localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime is : "+localDateTime);


    }
}

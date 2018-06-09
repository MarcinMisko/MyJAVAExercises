package time.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();     // current datetime
        System.out.println(LocalDate.of(2018, Month.MARCH, 19)); //
        System.out.println(LocalDate.ofEpochDay(0));  //day zero
        System.out.println(LocalTime.of(17, 18)); // the train I took home today
        System.out.println(LocalTime.parse("10:15:30")); // From a String



    }
}

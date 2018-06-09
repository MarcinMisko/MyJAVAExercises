package time.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate future = LocalDate.now().plusDays(1).plusYears(2);  // dodanie dni i lat do daty z linii powyżej
        LocalDateTime futureWithTime = LocalDateTime.now().with(LocalTime.of(17, 18));

        System.out.println(date);
        System.out.println(future);
        System.out.println(futureWithTime);

        System.out.println(date.compareTo(future));
        System.out.println(future.compareTo(futureWithTime.toLocalDate()));  //toLocalDate wyciąga samą datę z futureWithTime, w którym jest też godzina

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        System.out.println(formatter.format(futureWithTime));
        futureWithTime.format(formatter);
    }
}

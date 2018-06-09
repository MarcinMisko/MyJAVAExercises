package time.java8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PlanesExample {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm, YYYY-MM-dd");

        LocalDateTime localDateTime = LocalDateTime.of(2018, Month.APRIL, 17, 20, 30);
        System.out.println("LocalDateTime : " + format.format(localDateTime));


        ZonedDateTime parisDateTime = localDateTime.atZone(ZoneId.of("Europe/Paris"));  // ZoneId.of stworzenie strefy czasowej na podstawie podanego ID ("Europe/Paris")
        System.out.println("Depart : " + format.format(parisDateTime));


        ZonedDateTime japanDateTime = parisDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(12);
        System.out.println("Arrive : " + format.format(japanDateTime));

        System.out.println("\n---Detail---");
        System.out.println("Depart : " + parisDateTime);
        System.out.println("Arrive : " + japanDateTime);
    }
}

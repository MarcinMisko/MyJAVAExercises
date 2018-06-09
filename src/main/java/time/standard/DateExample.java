package time.standard;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();   // obecny czas podany w milisekundach od 1970 roku
        Date now = new Date(currentTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.get(Calendar.HOUR_OF_DAY);
        calendar.get(Calendar.APRIL);
        calendar.add(Calendar.DAY_OF_YEAR, 1);  //dodanie jednego dnia
        Date future = calendar.getTime();
        System.out.println(now);
        System.out.println(future);
        System.out.println(now.compareTo(future));  //porównanie dat

        TimeZone zoneCurrent = calendar.getTimeZone();
        System.out.println("Current timezone: " + zoneCurrent.getDisplayName());
        System.out.println("Current Zone Hour: " + calendar.get(Calendar.HOUR_OF_DAY));

        TimeZone zoneLA = TimeZone.getTimeZone("America/Los_Angeles");  //strefa czasowa dla danego miejsca na świecie
        System.out.println("LA timezone offset: " + zoneLA.getOffset(calendar.getTimeInMillis()));
        calendar.setTimeZone(zoneLA);  //ustawianie strefy czsowej z danego miejsca
        System.out.println("LA zone Hour: " + calendar.get(Calendar.HOUR_OF_DAY));




    }
}

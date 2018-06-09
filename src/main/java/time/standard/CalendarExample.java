package time.standard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone().getDisplayName(Locale.GERMANY));
        System.out.println(calendar.get(Calendar.YEAR));

        Locale koreanLocale = Locale.KOREAN;
        DateFormat format = SimpleDateFormat.getDateInstance(0, koreanLocale);
        System.out.println(format.format(new Date()));
    }
}

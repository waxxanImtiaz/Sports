package sports.util;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Minutes;
import org.joda.time.Period;

import java.util.concurrent.TimeUnit;

public class DateTimeUtil {
    public static void main(String[] args) {

//
//        DateTime dateTime = DateTime.now();
//        System.out.println("==========NOW============");
//        System.out.println(dateTime);
//        dateTime = dateTime.plusHours(44);
//        DateTime postingDate = DateTime.now();
//
//
//        System.out.println("=========TIME============");
//        System.out.println(postingDate);
//        long time = dateTime.getMillis() - postingDate.getMillis();
//
//
//
//        System.out.println("================");
////        TimeUnit.MINUTES.toMinutes(time);
//        System.out.println(time);
//
//
//        long minutes = (time / 1000) / 60;
//        System.out.println( minutes);
////        System.out.println( TimeUnit.MILLISECONDS.toMinutes(time));




        DateTime d1 = new DateTime();
        d1 = d1.minusHours(5);
        DateTime d2 = new DateTime();

        long diffInMillis = d2.getMillis() - d1.getMillis();

//        System.out.println(diffInMillis);


        DateTime today = new DateTime();
        DateTime before = new DateTime();
        before = before.minusHours(5);
//        DateTime yesterday = today.minusDays(1);

        Duration duration = new Duration(before, today);
//        System.out.println(duration.getStandardDays());
        System.out.println(duration.getStandardMinutes());
//        System.out.println(duration.getStandardMinutes());
    }
}

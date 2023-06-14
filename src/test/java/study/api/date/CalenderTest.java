package study.api.date;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    @Test
    void testCreateCalender() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        System.out.println(date);
        System.out.println("Milisecond: " + date.getTime());
    }

    @Test
    void testCalenderSignature() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 03);

        Date date = calendar.getTime();

        System.out.println(date);
        System.out.println("Milisecond: " + date.getTime());
    }

    @Test
    void testCalenderGetSignature() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MILLISECOND));
    }
}

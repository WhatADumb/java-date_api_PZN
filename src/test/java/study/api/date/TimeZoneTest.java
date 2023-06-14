package study.api.date;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void testCreateTimezone() {
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Jakarta");

        System.out.println(timeZone);
        System.out.println(timeZone2);
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
    }

    @Test
    void testTimezoneCalender() {
        Calendar indoTimezone = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar japanTimezone = Calendar.getInstance(TimeZone.getTimeZone("Japan"));

        System.out.println(indoTimezone.get(Calendar.HOUR_OF_DAY));
        System.out.println(japanTimezone.get(Calendar.HOUR_OF_DAY));

        japanTimezone.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        System.out.println(japanTimezone.get(Calendar.HOUR_OF_DAY));
    }
}

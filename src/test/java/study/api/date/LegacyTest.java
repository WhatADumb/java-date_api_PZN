package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {
    @Test
    void testFromLegacy() {
        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        System.out.println(instant);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Instant instant1 = calendar.toInstant();
        System.out.println(instant1);

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test
    void testToLegacy() {
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);
        Date date = Date.from(dateTime.now().toInstant());
        System.out.println(date);

        Calendar calendar = GregorianCalendar.from(dateTime);
        System.out.println(calendar);

        ZoneId zoneId = ZoneId.of("Asia/Jakarta");
        System.out.println(zoneId);
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);
    }
}

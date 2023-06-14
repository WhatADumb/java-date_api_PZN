package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ZoneOffsetTest {
    @Test
    void testCreate() {
        OffsetTime offsetTime1 = OffsetTime.now();
        OffsetTime offsetTime2 = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(12));
        //Pattern parse(HH:mm:dd.nano+ZoneOffSet)
        OffsetTime offsetTime3 = OffsetTime.parse("23:15:20+12:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(9));
        //Pattern parse(yyyy-MM-ddTHH:mm:ss.nano+ZoneOffSet)
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("2000-12-31T23:59:59+04:00");

        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
    }

    @Test
    void testConvertTime() {
        LocalTime localTime = LocalTime.now();

        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(-12));
        System.out.println(offsetTime);

        LocalTime convertLocalTime = offsetTime.toLocalTime();
        System.out.println(convertLocalTime);
    }

    @Test
    void testConvertDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(12));
        System.out.println(offsetDateTime);

        LocalDateTime convertLocalDateTime = offsetDateTime.toLocalDateTime();
        System.out.println(convertLocalDateTime);
    }
}

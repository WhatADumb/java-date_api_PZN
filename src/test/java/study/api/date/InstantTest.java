package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {
    @Test
    void testCreate() {
        Instant instant = Instant.now();
        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        Instant instant2 = Instant.ofEpochSecond(0);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void testModify() {
        Instant instant = Instant.now();
        Instant instant1 = instant.plusMillis(1000 * 60);
        Instant instant2 = instant.minusSeconds(60);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void testRetrieve() {
        Instant instant = Instant.now();

        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());
    }

    @Test
    void testConvertFromInstant() {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Jakarta");

        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
        System.out.println(offsetDateTime);
    }

    @Test
    void testConvertToInstant() {
        Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant1);

        Instant instant2 = OffsetDateTime.now().toInstant();
        System.out.println(instant2);
    }
}

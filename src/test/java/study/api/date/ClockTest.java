package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    @Test
    void testCreate() {
        Clock clock1 = Clock.systemUTC();
        Clock clock2 = Clock.systemDefaultZone();
        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }

    @Test
    void testToInstant() throws InterruptedException{
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant = clock.instant();
        System.out.println(instant);

        Thread.sleep(2_000);

        Instant instant1 = Instant.now(clock);
        System.out.println(instant1);
    }

    @Test
    //Best Practice
    void testDateTimeFromClock() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clock);
        System.out.println(year);

        LocalDateTime localDateTime = LocalDateTime.now(clock);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        System.out.println(offsetDateTime);
    }
}

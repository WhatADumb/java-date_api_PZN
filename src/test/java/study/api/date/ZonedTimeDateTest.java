package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedTimeDateTest {
    @Test
    void testCreate() {
        ZonedDateTime dateTime1 = ZonedDateTime.now();
        ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.systemDefault());
        ZonedDateTime dateTime3 = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
        ZonedDateTime dateTime4 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Japan"));
        ZonedDateTime dateTime5 = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(6));

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
        System.out.println(dateTime4);
        System.out.println(dateTime5);
    }

    @Test
    void testParse() {
        //Pattern parse(yyyy-MM-ddTHH:mm:ss.nano(+/-)ZoneOffset[ZoneId])
        ZonedDateTime dateTime1 = ZonedDateTime.parse("2000-11-25T14:50:09+07:00");
        ZonedDateTime dateTime2 = ZonedDateTime.parse("2000-11-25T14:50:09+07:00[Japan]");

        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }

    @Test
    void testChange() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("Asia/Jakarta"));
        System.out.println(zonedDateTime2);

        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("Japan"));
        System.out.println(zonedDateTime3);
    }
}

package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    @Test
    void testCreate() {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2000, 10, 12, 12, 30, 0);
        //Pattern Parse (yyyy-MM-ddTHH:mm:ss.nano)
        LocalDateTime dateTime3 = LocalDateTime.parse("1999-03-10T13:30:45");

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }

    @Test
    void testChange() {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.withMinute(30);
        LocalDateTime dateTime3 = dateTime1.withYear(2003).withHour(23);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }

    @Test
    void testModify() {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusHours(12);
        LocalDateTime dateTime3 = dateTime1.plusYears(4).plusMinutes(30).minusDays(30);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }

    @Test
    void testRetrieve() {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Tanggal & Jam: " + dateTime.getDayOfMonth() + "-" + dateTime.getMonth() + "-" + dateTime.getYear() + " & " + dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond());
    }

    @Test
    void testConvertDate() {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate localDate = dateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDateTime = localDate.atTime(LocalTime.now());
        System.out.println(localDateTime);
    }

    @Test
    void testConvertTime() {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalTime localTime = dateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime localDateTime = localTime.atDate(LocalDate.now());
        System.out.println(localDateTime);
    }
}

package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    void testCreate() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(14, 59, 50);
        //Pattern Parse (HH:mm:ss.nano)
        LocalTime time3 = LocalTime.parse("12:30:00.54321");

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    @Test
    void testChange() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.withSecond(0);
        LocalTime time3 = time1.withHour(23).withMinute(55);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    @Test
    void testModify() {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plusHours(12);
        LocalTime time3 = time1.minusHours(12).minusMinutes(50).minusSeconds(40);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    @Test
    void testRetrieve() {
        LocalTime time = LocalTime.now();

        System.out.println("Waktu Sekarang: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}

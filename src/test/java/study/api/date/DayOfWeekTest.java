package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void testCreate() {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek dayOfWeek1 = dayOfWeek.plus(3);
        DayOfWeek dayOfWeek2 = dayOfWeek.minus(1);

        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
    }
}

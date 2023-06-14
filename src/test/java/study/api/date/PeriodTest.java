package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {
    @Test
    void testCreate() {
        Period period1 = Period.ofDays(12);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(12);
        Period period4 = Period.ofYears(20);
        Period period5 = Period.of(21, 12, 31);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void testRetrieve() {
        Period period = Period.of(13, 12, 21);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }

    @Test
    void testInterval() {
        Period period1 = Period.between(LocalDate.of(2003, Month.OCTOBER, 03), LocalDate.now());
        System.out.println(period1);

        Period period2 = Period.between(LocalDate.of(1945, Month.AUGUST, 17), LocalDate.now());
        System.out.println(period2);
    }
}

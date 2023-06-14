package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearYearMonthMonthDayTest {
    @Test
    void testCreate() {
        Year year1 = Year.now();
        Year year2 = Year.of(1999);
        //Pattern parse(yyyy)
        Year year3 = Year.parse("2000");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(2005, 12);
        //Pattern parse (yyyy-MM)
        YearMonth yearMonth3 = YearMonth.parse("2003-01");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(03, 03);
        MonthDay monthDay3 = MonthDay.parse("--09-30");

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

    //It is Support for Change & Modify method


    @Test
    void testRetrieve() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getDayOfMonth());
    }

    @Test
    void testConvert() {
        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.OCTOBER).atDay(24);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }
}

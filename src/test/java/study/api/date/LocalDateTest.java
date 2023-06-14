package study.api.date;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void testLocalDateInitialisation() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(1945, Month.AUGUST, 17);
        //Pattern Parse (yyyy-MM-dd1)
        LocalDate localDate3 = LocalDate.parse("2003-10-03");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        assertNotSame(localDate1, localDate2);
        assertNotSame(localDate1, localDate3);
        assertNotSame(localDate2, localDate3);
    }

    @Test
    void testLocalDatePrefixWith() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2000);
        LocalDate localDate3 = localDate1.withYear(1990).withMonth(12).withDayOfMonth(31);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        assertNotEquals(localDate1, localDate2);
        assertNotEquals(localDate2, localDate3);
        assertNotEquals(localDate3, localDate1);
    }

    @Test
    void testLocalDateModify() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusMonths(10);
        LocalDate localDate3 = localDate1.minusYears(2).minusDays(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testLocalDatePrefixGet() {
        LocalDate localDate1 = LocalDate.now();

        System.out.println("Tanggal: " + localDate1.getDayOfMonth() + "-" + localDate1.getMonth() + ", " + localDate1.getYear());
    }
}

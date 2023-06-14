package study.api.date;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {
    @Test
    void testDateCreate() {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        System.out.println(date1);
        System.out.println(date2);
    }
}

package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseAndFormatTest {
    @Test
    void testParse() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate = LocalDate.parse("21 04 2023", formatter);
        System.out.println(localDate);
    }

    @Test
    void testFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate = LocalDate.now();
        var formatDate = localDate.format(formatter);
        System.out.println(formatDate);
    }

    @Test
    void testDefaultFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate = LocalDate.parse("19 12 2023", formatter);
        var formatDate = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(formatDate);
    }

    @Test
    void testI18n() {
        Locale locale = new Locale("id", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        LocalDate date = LocalDate.now();
        var dateIndo = date.format(formatter);

        System.out.println(dateIndo);
    }
}

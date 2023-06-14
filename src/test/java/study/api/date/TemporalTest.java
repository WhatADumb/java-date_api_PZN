package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {
    @Test
    void testTemporal() {
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalDateTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = OffsetDateTime.now();
    }

    @Test
    void testTemporalAmount() {
        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(12));
        Temporal temporal3 = temporal1.minus(Period.ofDays(12));

        System.out.println(temporal2);
        System.out.println(temporal3);
    }

    @Test
    void testTemporalUnit() {
        var temporal = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusYears(3));
        System.out.println(temporal);
    }

    @Test
    void testTemporalField() {
        Temporal temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_DAY));
        System.out.println(temporal.get(ChronoField.MICRO_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
    }

    @Test
    void testTemporalQuery() {
        Temporal temporal = LocalDateTime.now();

        List<Integer> valTemporal = temporal.query(new TemporalQuery<List<Integer>>() {
            @Override
            public List<Integer> queryFrom(TemporalAccessor temporal) {
                ArrayList<Integer> dates = new ArrayList<>();

                dates.add(temporal.get(ChronoField.YEAR));
                dates.add(temporal.get(ChronoField.MONTH_OF_YEAR));
                dates.add(temporal.get(ChronoField.DAY_OF_MONTH));

                return dates;
            }
        });

        System.out.println(valTemporal);
    }

    @Test
    void testTemporalAdjuster() {
        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);

        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        12
                );
            }
        });
        System.out.println(temporal2);

        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);
    }
}

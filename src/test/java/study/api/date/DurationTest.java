package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {
    @Test
    void testCreate() {
        Duration duration1 = Duration.ofHours(10);
        Duration duration2 = Duration.ofMinutes(10);
        Duration duration3 = Duration.ofSeconds(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }

    @Test
    void testRetrieve() {
        Duration duration = Duration.ofHours(24);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }

    @Test
    void testInterval() {
        Duration duration1 = Duration.between(LocalTime.now(), LocalTime.now().plusHours(2));
        System.out.println(duration1);

        Duration duration2 = Duration.between(LocalTime.now().plusHours(9), LocalTime.now());
        System.out.println(duration2);
    }
}

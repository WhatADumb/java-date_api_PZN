package study.api.date;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {
    
    @Test
    void testZoneIdCreate() {
        ZoneId zoneId1 = ZoneId.systemDefault();
        ZoneId zoneId2 = ZoneId.of("Japan");
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(zoneId1);
        System.out.println(zoneId2);
        availableZoneIds.forEach(System.out::println);
    }

    @Test
    void testZoneOffsetCreate() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}

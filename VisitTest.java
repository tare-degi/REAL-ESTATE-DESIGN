package com.realestate.platform;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class VisitTest {

    @Test
    void testUnsupportedOperation() {
        Visit visit = new Visit();
        assertThrows(UnsupportedOperationException.class, visit::schedule);
    }

    @Test
    void testGetterAndSetterMethods() {
        Visit visit = new Visit();

        LocalDateTime dateTime = LocalDateTime.of(2025, 5, 10, 15, 30);

        visit.setId("V123");
        visit.setPropertyId("P456");
        visit.setBuyerId("B789");
        visit.setDateTime(dateTime);
        visit.setType("In-person");

        assertEquals("V123", visit.getId());
        assertEquals("P456", visit.getPropertyId());
        assertEquals("B789", visit.getBuyerId());
        assertEquals(dateTime, visit.getDateTime());
        assertEquals("In-person", visit.getType());
    }

    @Test
    void testNullValues() {
        Visit visit = new Visit();

        visit.setId(null);
        visit.setPropertyId(null);
        visit.setBuyerId(null);
        visit.setDateTime(null);
        visit.setType(null);

        assertNull(visit.getId());
        assertNull(visit.getPropertyId());
        assertNull(visit.getBuyerId());
        assertNull(visit.getDateTime());
        assertNull(visit.getType());
    }
}

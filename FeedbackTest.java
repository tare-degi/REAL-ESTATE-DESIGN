package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest {

    @Test
    void testSubmitThrowsUnsupportedOperationException() {
        Feedback feedback = new Feedback();
        assertThrows(UnsupportedOperationException.class, feedback::submit);
    }

    @Test
    void testGetterSetterMethods() {
        Feedback feedback = new Feedback();

        feedback.setId("F001");
        feedback.setBuyerId("B123");
        feedback.setPropertyId("P456");
        feedback.setMessage("This is a great property!");

        assertEquals("F001", feedback.getId());
        assertEquals("B123", feedback.getBuyerId());
        assertEquals("P456", feedback.getPropertyId());
        assertEquals("This is a great property!", feedback.getMessage());
    }

    @Test
    void testNullValues() {
        Feedback feedback = new Feedback();

        feedback.setId(null);
        feedback.setBuyerId(null);
        feedback.setPropertyId(null);
        feedback.setMessage(null);

        assertNull(feedback.getId());
        assertNull(feedback.getBuyerId());
        assertNull(feedback.getPropertyId());
        assertNull(feedback.getMessage());
    }
}

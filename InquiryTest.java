package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InquiryTest {

    @Test
    void testUnsupportedOperations() {
        Inquiry inquiry = new Inquiry();

        assertThrows(UnsupportedOperationException.class, inquiry::send);
        assertThrows(UnsupportedOperationException.class, inquiry::respond);
    }

    @Test
    void testGetterAndSetterMethods() {
        Inquiry inquiry = new Inquiry();

        inquiry.setId("INQ001");
        inquiry.setBuyerId("BUY123");
        inquiry.setMessage("Is the property still available?");
        inquiry.setResponse("Yes, it's available.");

        assertEquals("INQ001", inquiry.getId());
        assertEquals("BUY123", inquiry.getBuyerId());
        assertEquals("Is the property still available?", inquiry.getMessage());
        assertEquals("Yes, it's available.", inquiry.getResponse());
    }

    @Test
    void testNullValues() {
        Inquiry inquiry = new Inquiry();

        inquiry.setId(null);
        inquiry.setBuyerId(null);
        inquiry.setMessage(null);
        inquiry.setResponse(null);

        assertNull(inquiry.getId());
        assertNull(inquiry.getBuyerId());
        assertNull(inquiry.getMessage());
        assertNull(inquiry.getResponse());
    }
}

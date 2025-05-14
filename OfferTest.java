package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OfferTest {

    @Test
    void testUnsupportedOperations() {
        Offer offer = new Offer();
        assertThrows(UnsupportedOperationException.class, offer::submit);
        assertThrows(UnsupportedOperationException.class, offer::trackStatus);
    }

    @Test
    void testGetterSetters() {
        Offer offer = new Offer();

        offer.setId("O001");
        offer.setPropertyId("P001");
        offer.setBuyerId("B001");
        offer.setAmount(150000.0f);
        offer.setStatus("Pending");
        offer.setPropertyeId("P001_DUPLICATE");

        assertEquals("O001", offer.getId());
        assertEquals("P001", offer.getPropertyId());
        assertEquals("B001", offer.getBuyerId());
        assertEquals(150000.0f, offer.getAmount());
        assertEquals("Pending", offer.getStatus());
        assertEquals("P001_DUPLICATE", offer.getPropertyeId());
    }

    @Test
    void testNullAndZeroValues() {
        Offer offer = new Offer();

        offer.setId(null);
        offer.setPropertyId(null);
        offer.setBuyerId(null);
        offer.setAmount(0.0f);
        offer.setStatus(null);
        offer.setPropertyeId(null);

        assertNull(offer.getId());
        assertNull(offer.getPropertyId());
        assertNull(offer.getBuyerId());
        assertEquals(0.0f, offer.getAmount());
        assertNull(offer.getStatus());
        assertNull(offer.getPropertyeId());
    }
}

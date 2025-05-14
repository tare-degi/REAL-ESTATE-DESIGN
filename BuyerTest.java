package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuyerTest {

    @Test
    void testUnsupportedMethods() {
        Buyer buyer = new Buyer();

        // Testing unsupported methods that should throw UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, buyer::register);
        assertThrows(UnsupportedOperationException.class, buyer::login);
        assertThrows(UnsupportedOperationException.class, buyer::logout);
        assertThrows(UnsupportedOperationException.class, buyer::resetPassword);
        assertThrows(UnsupportedOperationException.class, buyer::manageAccount);
        assertThrows(UnsupportedOperationException.class, buyer::searchProperties);
        assertThrows(UnsupportedOperationException.class, buyer::viewMap);
        assertThrows(UnsupportedOperationException.class, buyer::compareListing);
        assertThrows(UnsupportedOperationException.class, buyer::bookVisit);
        assertThrows(UnsupportedOperationException.class, buyer::submitOffer);
        assertThrows(UnsupportedOperationException.class, buyer::makePayment);
        assertThrows(UnsupportedOperationException.class, buyer::sendInquiry);
        assertThrows(UnsupportedOperationException.class, buyer::giveFeedback);
        assertThrows(UnsupportedOperationException.class, buyer::contactAdmin);
    }

    @Test
    void testGetterSetters() {
        Buyer buyer = new Buyer();

        // Setting values using setters
        buyer.setId("B001");
        buyer.setName("Alice Smith");
        buyer.setEmail("alice@example.com");
        buyer.setPassword("secure123");

        // Verifying that the setters correctly set the values
        assertEquals("B001", buyer.getId());
        assertEquals("Alice Smith", buyer.getName());
        assertEquals("alice@example.com", buyer.getEmail());
        assertEquals("secure123", buyer.getPassword());
    }

    // Test invalid setter scenarios where we set null or empty strings.
    // These will not throw exceptions based on current class design, so we check values.

    @Test
    void testSetIdWithNull() {
        Buyer buyer = new Buyer();
        buyer.setId(null);  // No exception will be thrown, it will accept null
        assertNull(buyer.getId());
    }

    @Test
    void testSetNameWithNull() {
        Buyer buyer = new Buyer();
        buyer.setName(null);  // No exception will be thrown, it will accept null
        assertNull(buyer.getName());
    }

    @Test
    void testSetEmailWithInvalidFormat() {
        Buyer buyer = new Buyer();
        buyer.setEmail("invalid-email");  // No exception will be thrown, it will accept the invalid value
        assertEquals("invalid-email", buyer.getEmail());
    }

    @Test
    void testSetPasswordWithNull() {
        Buyer buyer = new Buyer();
        buyer.setPassword(null);  // No exception will be thrown, it will accept null
        assertNull(buyer.getPassword());
    }

    @Test
    void testSetEmailWithEmptyString() {
        Buyer buyer = new Buyer();
        buyer.setEmail("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", buyer.getEmail());
    }

    @Test
    void testSetPasswordWithEmptyString() {
        Buyer buyer = new Buyer();
        buyer.setPassword("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", buyer.getPassword());
    }

    @Test
    void testSetIdWithEmptyString() {
        Buyer buyer = new Buyer();
        buyer.setId("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", buyer.getId());
    }

    @Test
    void testSetNameWithEmptyString() {
        Buyer buyer = new Buyer();
        buyer.setName("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", buyer.getName());
    }
}

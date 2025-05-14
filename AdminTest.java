package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    @Test
    void testUnsupportedMethods() {
        Admin admin = new Admin();

        // Testing unsupported methods that should throw UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, admin::login);
        assertThrows(UnsupportedOperationException.class, admin::logout);
        assertThrows(UnsupportedOperationException.class, admin::listProperty);
        assertThrows(UnsupportedOperationException.class, admin::editProperty);
        assertThrows(UnsupportedOperationException.class, admin::approveListing);
        assertThrows(UnsupportedOperationException.class, admin::manageUser);
        assertThrows(UnsupportedOperationException.class, admin::verifyBuyerContact);
        assertThrows(UnsupportedOperationException.class, admin::respondToInquiry);
        assertThrows(UnsupportedOperationException.class, admin::monitorTransactions);
        assertThrows(UnsupportedOperationException.class, admin::removeFeedback);
        assertThrows(UnsupportedOperationException.class, admin::generateReport);
        assertThrows(UnsupportedOperationException.class, admin::sendNotification);
    }

    @Test
    void testGetterSetters() {
        Admin admin = new Admin();

        // Testing setters and getters
        admin.setId("A001");
        admin.setName("Malik Worku");
        admin.setEmail("admin@example.com");
        admin.setRole("Manager");

        // Verifying that the setters are correctly setting the values
        assertEquals("A001", admin.getId());
        assertEquals("Malik Worku", admin.getName());
        assertEquals("admin@example.com", admin.getEmail());
        assertEquals("Manager", admin.getRole());
    }

    // Testing null and empty values for setters, which will be accepted by Admin class (no validation in place)
    @Test
    void testSetIdWithNull() {
        Admin admin = new Admin();
        admin.setId(null);  // No exception will be thrown, it will accept null
        assertNull(admin.getId());
    }

    @Test
    void testSetNameWithNull() {
        Admin admin = new Admin();
        admin.setName(null);  // No exception will be thrown, it will accept null
        assertNull(admin.getName());
    }

    @Test
    void testSetEmailWithInvalidFormat() {
        Admin admin = new Admin();
        admin.setEmail("invalid-email");  // No exception will be thrown, it will accept the value
        assertEquals("invalid-email", admin.getEmail());
    }

    @Test
    void testSetRoleWithNull() {
        Admin admin = new Admin();
        admin.setRole(null);  // No exception will be thrown, it will accept null
        assertNull(admin.getRole());
    }

    @Test
    void testSetEmailWithEmptyString() {
        Admin admin = new Admin();
        admin.setEmail("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", admin.getEmail());
    }

    @Test
    void testSetRoleWithEmptyString() {
        Admin admin = new Admin();
        admin.setRole("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", admin.getRole());
    }

    @Test
    void testSetIdWithEmptyString() {
        Admin admin = new Admin();
        admin.setId("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", admin.getId());
    }
}

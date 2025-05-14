package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrganizationTest {

    @Test
    void testUnsupportedMethods() {
        Organization organization = new Organization();

        // Testing unsupported methods that should throw UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, organization::login);
        assertThrows(UnsupportedOperationException.class, organization::logout);
        assertThrows(UnsupportedOperationException.class, organization::sendPropertyFile);
        assertThrows(UnsupportedOperationException.class, organization::providePropertyAssets);
        assertThrows(UnsupportedOperationException.class, organization::setListingPolicies);
    }

    @Test
    void testGetterSetters() {
        Organization organization = new Organization();

        // Setting values using setters
        organization.setId("O001");
        organization.setName("XYZ Properties");
        organization.setContactInfo("1234 Property St, City, Country");

        // Verifying that the setters correctly set the values
        assertEquals("O001", organization.getId());
        assertEquals("XYZ Properties", organization.getName());
        assertEquals("1234 Property St, City, Country", organization.getContactInfo());
    }

    @Test
    void testSetIdWithNull() {
        Organization organization = new Organization();
        organization.setId(null);  // No exception will be thrown, it will accept null
        assertNull(organization.getId());
    }

    @Test
    void testSetNameWithNull() {
        Organization organization = new Organization();
        organization.setName(null);  // No exception will be thrown, it will accept null
        assertNull(organization.getName());
    }

    @Test
    void testSetContactInfoWithNull() {
        Organization organization = new Organization();
        organization.setContactInfo(null);  // No exception will be thrown, it will accept null
        assertNull(organization.getContactInfo());
    }

    @Test
    void testSetIdWithEmptyString() {
        Organization organization = new Organization();
        organization.setId("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", organization.getId());
    }

    @Test
    void testSetNameWithEmptyString() {
        Organization organization = new Organization();
        organization.setName("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", organization.getName());
    }

    @Test
    void testSetContactInfoWithEmptyString() {
        Organization organization = new Organization();
        organization.setContactInfo("");  // No exception will be thrown, it will accept an empty string
        assertEquals("", organization.getContactInfo());
    }
}

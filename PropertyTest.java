package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    @Test
    void testViewDetailsThrowsException() {
        Property property = new Property();
        assertThrows(UnsupportedOperationException.class, property::viewDetails);
    }

    @Test
    void testEditThrowsException() {
        Property property = new Property();
        assertThrows(UnsupportedOperationException.class, property::edit);
    }

    @Test
    void testAssignToGroupThrowsException() {
        Property property = new Property();
        assertThrows(UnsupportedOperationException.class, property::assignToGroup);
    }

    @Test
    void testGetterAndSetterMethods() {
        Property property = new Property();

        property.setId("P001");
        property.setTitle("Modern Villa");
        property.setLocation("Downtown");
        property.setPrice(950000.0f);
        property.setDescription("Luxury villa with 4 bedrooms");
        property.setStatus("Available");
        property.setPhase("Phase 2");
        property.setCommunity("Green Meadows");

        assertEquals("P001", property.getId());
        assertEquals("Modern Villa", property.getTitle());
        assertEquals("Downtown", property.getLocation());
        assertEquals(950000.0f, property.getPrice());
        assertEquals("Luxury villa with 4 bedrooms", property.getDescription());
        assertEquals("Available", property.getStatus());
        assertEquals("Phase 2", property.getPhase());
        assertEquals("Green Meadows", property.getCommunity());
    }

    @Test
    void testNullValues() {
        Property property = new Property();

        property.setId(null);
        property.setTitle(null);
        property.setLocation(null);
        property.setPrice(null);
        property.setDescription(null);
        property.setStatus(null);
        property.setPhase(null);
        property.setCommunity(null);

        assertNull(property.getId());
        assertNull(property.getTitle());
        assertNull(property.getLocation());
        assertNull(property.getPrice());
        assertNull(property.getDescription());
        assertNull(property.getStatus());
        assertNull(property.getPhase());
        assertNull(property.getCommunity());
    }
}

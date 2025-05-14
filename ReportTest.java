package com.realestate.platform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {

    @Test
    void testGenerateUnsupportedOperation() {
        Report report = new Report();
        assertThrows(UnsupportedOperationException.class, report::generate);
    }

    @Test
    void testGetterAndSetterMethods() {
        Report report = new Report();

        report.setId("R001");
        report.setAdmin("Admin123");
        report.setType("Sales");
        report.setData("Detailed monthly report");

        assertEquals("R001", report.getId());
        assertEquals("Admin123", report.getAdmin());
        assertEquals("Sales", report.getType());
        assertEquals("Detailed monthly report", report.getData());
    }

    @Test
    void testNullValues() {
        Report report = new Report();

        report.setId(null);
        report.setAdmin(null);
        report.setType(null);
        report.setData(null);

        assertNull(report.getId());
        assertNull(report.getAdmin());
        assertNull(report.getType());
        assertNull(report.getData());
    }
}

package developer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTests {
    Developer developer = new Developer();
    DeveloperLogic logic = new DeveloperLogic();

    @Before
    public void setUp() {
        developer.setFirstName("SomeFirstName");
        developer.setLastName("SomeLastName");
        developer.setSpecialty("Java developer");
        developer.setSalary(4800_00);
    }

    @Test
    public void shouldCreateDeveloperInstanceTest() {
        assertEquals("SomeFirstName", developer.getFirstName());
        assertEquals("SomeLastName", developer.getLastName());
        assertEquals("Java developer", developer.getSpecialty());
        assertEquals(4800_00, developer.getSalary());
    }

    @Test
    public void shouldCalculateAnnualSalaryTest() {
        assertEquals(57600_00, logic.calculateAnnualSalary(developer));
    }

    @Test
    public void shouldCalculateHourRateTest() {
        assertEquals(3000, logic.calculateHourRate(developer));
    }

    @Test
    public void shouldPrintCorrectSalaryTest() {
        assertEquals("developer{firstName='SomeFirstName', lastName='SomeLastName', specialty='Java developer', salary=4800.0}", developer.toString());
    }

}

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator(10, 20);

    @Test
    public void testShouldCreateCalculatorInstance() {
        assertNotNull(calculator);
    }

    @Test
    public void testCalculateSum() {
        assertEquals(30, calculator.calculateSum());
    }
}
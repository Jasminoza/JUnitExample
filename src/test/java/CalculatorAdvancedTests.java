import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAdvancedTests {
    Calculator calculator = new Calculator();
    private int firstNumber;
    private int secondNumber;

    @Before
    public void setUp() {
        firstNumber = 100;
        secondNumber = 200;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
    }

    @Test
    public void testShouldCreateCalculatorWithSetUpValues() {
        assertEquals(100, calculator.getFirstNumber());
        assertEquals(200, calculator.getSecondNumber());
    }

    @Test
    public void testShouldReturnCorrectSum() {
        assertEquals(300, calculator.calculateSum());
    }
}
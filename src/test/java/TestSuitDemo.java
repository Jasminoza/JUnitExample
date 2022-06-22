import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, CalculatorAdvancedTests.class})

public class TestSuitDemo {
//    TestSuite testSuite = new TestSuite(testCalculator.class, CalculatorAdvancedTests.class);
//    TestResult testResult = new TestResult();
//
//    @Test
//    public void testSuitInAction() {
//        testSuite.run(testResult);
//        testSuite.setName("SimpleTestSuit");
//        System.out.println("Name of Test Suit: " + testSuite.getName());
//        System.out.println("Amount of test cases: " + testSuite.testCount());
//        System.out.println("Errors count: " + testResult.errorCount());
//        System.out.println("Failures count: " + testResult.failureCount());
//
//        for (int i = 0; i < testSuite.testCount(); i++) {
//            testResult.endTest(testSuite.testAt(i));
//        }
//    }
}

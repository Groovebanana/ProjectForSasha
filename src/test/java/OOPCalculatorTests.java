import Task5.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class OOPCalculatorTests {
    private final double DELTA = 1e-15;

    @Test
    public void sumShoudBe333() {
        Task5.Calculator calculator = new Calculator(184);
        calculator.add(149);
        calculator.showResult();
        Assert.assertEquals(333, calculator.getResult(), DELTA);
    }

    @Test
    public void substractionShoudbe1337_69() {
        Task5.Calculator calculator = new Calculator(5302.593);
        calculator.substract(3964.903);
        calculator.showResult();
        Assert.assertEquals(1337.69, calculator.getResult(), DELTA);
    }

    @Test
    public void multiplictionShoudbe9999_99() {
        Task5.Calculator calculator = new Calculator(1111.11);
        calculator.multiply(9);
        calculator.showResult();
        Assert.assertEquals(9999.99, calculator.getResult(), DELTA);
    }

    @Test
    public void divisionShoudbe6969() {
        Task5.Calculator calculator = new Calculator(3177864);
        calculator.divide(456);
        calculator.showResult();
        Assert.assertEquals(6969.0, calculator.getResult(), DELTA);
    }

    @Test public void cantDivideByZero() {
        Task5.Calculator calculator = new Calculator(777);
        String expectedErrorMessage = "На ноль делить нельзя";
        String actualErrorMessage = "";
        try {
            calculator.divide(0);
        } catch (ArithmeticException e) {
            actualErrorMessage = e.getMessage();
        }

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}

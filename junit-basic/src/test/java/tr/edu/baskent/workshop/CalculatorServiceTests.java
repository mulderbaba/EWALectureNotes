package tr.edu.baskent.workshop;

import org.junit.Test;
import tr.edu.hacettepe.bbm490.Action;
import tr.edu.hacettepe.bbm490.CalculationResult;
import tr.edu.hacettepe.bbm490.CalculatorService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by mertcaliskan
 * on 19/12/14.
 */
public class CalculatorServiceTests {

    CalculatorService service = new CalculatorService();

    @Test
    public void addInvokedSuccessfullyAndReturnedProperCalculationResult() {
        CalculationResult result = service.add(4, 5);

        assertNotNull(result);
        assertEquals(result.getAction(), Action.ADD);
        assertEquals(result.getParam1(), Integer.valueOf(4));
        assertEquals(result.getParam2(), Integer.valueOf(5));
        assertEquals(result.getResult(), new Double(9));
    }

    @Test
    public void subtractInvokedSuccessfullyAndReturnedProperCalculationResult() {
        CalculationResult result = service.subtract(6, 4);

        assertNotNull(result);
        assertEquals(result.getAction(), Action.SUBTRACT);
        assertEquals(result.getParam1(), Integer.valueOf(6));
        assertEquals(result.getParam2(), Integer.valueOf(4));
        assertEquals(result.getResult(), new Double(2));
    }

    @Test
    public void multiplyInvokedSuccessfullyAndReturnedProperCalculationResult() {
        CalculationResult result = service.multiply(6, 4);

        assertNotNull(result);
        assertEquals(result.getAction(), Action.MULTIPLY);
        assertEquals(result.getParam1(), Integer.valueOf(6));
        assertEquals(result.getParam2(), Integer.valueOf(4));
        assertEquals(result.getResult(), new Double(24));
    }

    @Test
    public void divideInvokedSuccessfullyAndReturnedProperCalculationResult() {
        CalculationResult result = service.divide(6, 6);

        assertNotNull(result);
        assertEquals(result.getAction(), Action.DIVIDE);
        assertEquals(result.getParam1(), Integer.valueOf(6));
        assertEquals(result.getParam2(), Integer.valueOf(6));
        assertEquals(result.getResult(), new Double(1));
    }

    @Test(expected = ArithmeticException.class)
    public void divideInvokedSuccessfullyAndThrowsException() {
        CalculationResult result = service.divide(6, 0);
    }
}

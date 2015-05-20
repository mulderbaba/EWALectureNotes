package tr.edu.hacettepe.bbm490;

/**
 * Created by mertcaliskan
 * on 19/12/14.
 */
public class CalculatorService {

    public CalculationResult add(Integer a, Integer b) {
        CalculationResult result = new CalculationResultBuilder().action(Action.ADD).param1(a).param2(b).result(Double.valueOf((a + b))).build();
        return result;
    }

    public CalculationResult subtract(Integer a, Integer b) {
        CalculationResult result = new CalculationResultBuilder().action(Action.SUBTRACT).param1(a).param2(b).result(Double.valueOf((a - b))).build();
        return result;
    }

    public CalculationResult multiply(Integer a, Integer b) {
        CalculationResult result = new CalculationResultBuilder().action(Action.MULTIPLY).param1(a).param2(b).result(Double.valueOf((a * b))).build();
        return result;
    }

    public CalculationResult divide(Integer a, Integer b) {
        CalculationResult result = new CalculationResultBuilder().action(Action.DIVIDE).param1(a).param2(b).result(Double.valueOf(a / b)).build();
        return result;
    }
}

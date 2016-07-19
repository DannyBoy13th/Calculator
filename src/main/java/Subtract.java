import java.math.BigDecimal;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public class Subtract implements Operation {
    @Override
    public BigDecimal count(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    @Override
    public char getOperator() {
        return '-';
    }
}

import java.math.BigDecimal;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public class Add implements Operation {
    public BigDecimal count(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public char getOperator() {
        return '+';
    }
}

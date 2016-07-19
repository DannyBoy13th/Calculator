import java.math.BigDecimal;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public interface Operation {

    public BigDecimal count(BigDecimal num1, BigDecimal num2);
    char getOperator();
}

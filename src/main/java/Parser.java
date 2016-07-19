import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public interface Parser {
    public void parse (String expression);
    public List<BigDecimal> getOperands();
    public char getOperator();
}

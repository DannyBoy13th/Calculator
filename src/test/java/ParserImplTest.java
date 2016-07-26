import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Daniel Solo on 25.07.2016.
 */
public class ParserImplTest {

    ParserImpl parsedExpression = new ParserImpl();

    @org.junit.Test

    public void testParser() throws Exception {
        String example = "31+5";
        parsedExpression.parse(example);
        List<BigDecimal> operands = parsedExpression.getOperands();
        char operator = parsedExpression.getOperator();
        for (BigDecimal operand : operands) {
            System.out.println("operand " + operand);
        }
        System.out.println("operator " + operator);
    }

    @org.junit.Test

    public void testParser1() throws Exception {
        String example = "450  -  352";
        parsedExpression.parse(example);
        List<BigDecimal> operands = parsedExpression.getOperands();
        char operator = parsedExpression.getOperator();
        for (BigDecimal operand : operands) {
            System.out.println("operand " + operand);
        }
        System.out.println("operator " + operator);
    }



}
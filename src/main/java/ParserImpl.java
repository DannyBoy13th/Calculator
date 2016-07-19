import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public class ParserImpl implements Parser {

    public List<BigDecimal> operands;
    public char operator;


    @Override
    public void parse(String expression) {
        BigDecimal bigDecimal;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setParseBigDecimal(true);
        operands = new ArrayList<>();
        String temp = "";
        for (char c : expression.toCharArray()) {
            if ( c == ' ') continue;

            if ((c >= '0' && c <= '9') || (c == '.')){
                temp += c;
            }else{
                operator = c;
                try{
                    operands.add((BigDecimal) decimalFormat.parse(temp));
                }catch (NumberFormatException e){
                    System.out.println("Wrong Expression!");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                temp = "";
            }
        }
        try {
            operands.add((BigDecimal) decimalFormat.parse(temp));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<BigDecimal> getOperands() {
        return operands;
    }

    @Override
    public char getOperator() {
        return operator;
    }
}

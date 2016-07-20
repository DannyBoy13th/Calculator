import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public class Calculator {

    private Parser parser;

    private List<Operation> operations;

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public void addOperation(Operation operation){
        operations.add(operation);
    }

    public BigDecimal calculate(String expression){
        boolean operatorFound = false;
        BigDecimal result = BigDecimal.valueOf(0);
        parser.parse(expression);

        for (Operation operation : operations){
            if (operation.getOperator() != parser.getOperator()){
                continue;
            }
            operatorFound = true;

            result = operation.count(parser.getOperands().get(0), parser.getOperands().get(1));
        }
        if (!operatorFound){
            System.out.println("Wrong expression");
        }
        return result;
    }
}

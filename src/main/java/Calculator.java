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
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public class Provider implements OperationProvider {
    public List<Operation> operations = new ArrayList<Operation>();

    @Override
    public List<Operation> getAllOperations() {
        return operations;
    }

    @Override
    public void initialize() {
        operations.add(new Add());
        operations.add(new Subtract());
    }

    public void initExtraOperation(Operation operation) {

    }
}

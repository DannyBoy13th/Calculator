import java.util.List;

/**
 * Created by Daniel Solo on 19.07.2016.
 */
public interface OperationProvider {
    public List<Operation> getAllOperations();

    public void initialize();
    public void initExtraOperation(Operation operation);
}

import java.util.Scanner;

/**
 * Created by Daniel Solo on 26.07.2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        ParserImpl parser = new ParserImpl();
        Provider provider = new Provider();
        provider.initialize();
        calculator.setOperations(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println("Please enter numbers you want yo count in this format:(number/operator/number)");
        String task = scanner.nextLine();
        System.out.println("Result: " + task + '=' + calculator.calculate(task));
    }
}

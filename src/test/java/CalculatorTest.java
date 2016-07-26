import org.junit.Test;

/**
 * Created by Daniel Solo on 25.07.2016.
 */
public class CalculatorTest {
    @Test
    public void testCalculate() throws Exception {
        Provider provider = new Provider();
        ParserImpl parser = new ParserImpl();
        Calculator calculator = new Calculator();
        double result = 0;
        String a = "25-10";
        provider.initialize();
        calculator.setOperations(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println("Result: " + a + "=" + calculator.calculate(a));

    }

    @Test
    public void testCalculate1() throws Exception {
        Provider provider = new Provider();
        ParserImpl parser = new ParserImpl();
        Calculator calculator = new Calculator();
        double result = 0;
        String a = "13+45";
        provider.initialize();
        calculator.setOperations(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println("Result: " + a + "=" + calculator.calculate(a));

    }

    @Test
    public void testCalculate3() throws Exception {
        Provider provider = new Provider();
        ParserImpl parser = new ParserImpl();
        Calculator calculator = new Calculator();
        double result = 0;
        String a = "85 + 95 ";
        provider.initialize();
        calculator.setOperations(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println("Result: " + a + "=" + calculator.calculate(a));

    }

    @Test
    public void testCalculate4() throws Exception {
        Provider provider = new Provider();
        ParserImpl parser = new ParserImpl();
        Calculator calculator = new Calculator();
        double result = 0;
        String a = "1843    -    1283 ";
        provider.initialize();
        calculator.setOperations(provider.getAllOperations());
        calculator.setParser(parser);
        System.out.println("Result: " + a + "=" + calculator.calculate(a));

    }

}
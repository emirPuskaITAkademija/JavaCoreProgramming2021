package nine;

/**
 * VARIJABILNI ARGUMENTI -> VAR ARGS
 */
public class TestExecutor {
    public static void main(String[] args) {
        double[] brojevi = new double[4];
        brojevi[0] = 23;
        brojevi[1] = 13;
        brojevi[2] = 123;
        brojevi[3] = 2000;
        Calculator calculator = new Calculator();
        double sumuBrojeva = calculator.sum(brojevi);
        System.out.println("Suma bez VARARGS: " + sumuBrojeva);//2159.00
        double sumaBrojeva1 = calculator.sum("Albin","Fehrić",23,13,123, 2000);
        System.out.println("Suma sa VARARGS: " + sumaBrojeva1);
        double proizvod = calculator.product(23, 1, 13, 4);
        String lineSearator = System.lineSeparator();//"\r\n" -> "\n"
        System.out.format("Proizvod: %s%s", proizvod, lineSearator);

    }
}

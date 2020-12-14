package nine;

public class Calculator {

    /**
     * This function will take as argument array of numbers
     * and this function willl return  sum of those numbers.
     * <p>
     *
     * @param brojevi
     * @return sum
     */
    public double sum(double[] brojevi) {
        double suma = 0.0;

        for (int i = 0; i < brojevi.length; i++) {
            suma += brojevi[i];
        }
        return suma;
    }

    public double sum(String name, String surname, int age, double... numbers) {
        System.out.println(name + " poziva funkciju sum i sumira brojeve");
        return sum(numbers);
    }

    public double product(double... numbers) {
        double product = 1.0;
        for (double number : numbers) {
            product *=number;
        }
        return product;
    }
}

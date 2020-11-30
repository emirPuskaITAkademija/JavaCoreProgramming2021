package one;
// && AND
// ||
public class ConditionalComparisonDemo {
    public static void main(String[] args) {
        int value1 = 2;
        int value2 = 3;
        if ((value1 == 2) && (value1 > value2)) {
            System.out.println("Value1 je 2 i a value2 je sigurno nešto manje od 2");
        }
        if ((value1 == 2) || (value2 == 2)) {
            System.out.println("JEdna od dvije vrijednosti su garant dvojka");
        }
        value2++;
        System.out.println("Value2 == 4" + " Da li je 4 ? Rezultat = " + value2);
    }
}

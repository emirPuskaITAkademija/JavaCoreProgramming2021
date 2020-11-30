package five.object;

/**
 * Tipove podataka:
 * <li>1. prosti ili primitivni</li>
 */
public class Executor {
    public static void main(String[] args) {
        int number = 23;
        number = 13;
        //niz
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 13;
        //Polja niza su indeksirana/imenovana
        //Svi unutar niza su istog tipa/Ovdje svi nisu istog tipa
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Adi";
        p1.surname = "Omanović";
    }
}

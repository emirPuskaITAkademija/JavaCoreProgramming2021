package seven;

/**
 * <li>1. Koncept klase/objekat</li>
 * <p>OOP -> kreirajući objekte i relacije između </p>
 * <li>2. Koncepti OOP jezika
 *      <li>2.1 Enkapsulacija</li>
 *      <li>2.2 Apstrakcija</li>
 *      <li>2.3 Nasljeđivanje</li>
 *      <li>2.4 Polimorfizma</li>
 * </li>
 */
public class SevenExecutor {
    public static void main(String[] args) {
        //p1 -> p1.name = "Adi"
        Person p1 = new Person("Adi");
        p1.setName("Djevojačko Adi");
        p1.name = "Djevojačko Adi";//public
        p1.surname = "Djevojačko Prezime";//paketno
        p1.weight = 23.0;//protected
        p1.setAge(17);
        int godine = p1.getAge();
    }
}

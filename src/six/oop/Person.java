package six.oop;

/**
 * Klasa:
 * <li>1. outer klasa</li>
 * <li>2. inner klase</li>
 *
 *
 * <p>Modifikatora vidljivosti:
 * <li>1. public -> svima dostupna klasa</li>
 * <li>2. bez_kljucne -> paketno vidljivo </li>
 * </p>
 * <p>
 * Klasa može imati:
 * <li>1. atribute, polja ili properties
 * 1.1 static
 * 1.2 non-static
 * </li>
 *
 * <li>2. konstruktor -> konstruiše varijabla ili objekat</li>
 *
 * <li>3. funkcije ili metode
 *      3.1 static
 *      3.2 non-static
 *
 * </li>
 */
public class Person {
    //static
    public static int counter = 0;
    //non-static
    public String name;
    public String surname;
    public int age;

    //overloading po broju parametara
    public Person() {
        super();
        System.out.println("Kreira se objekat...");
        counter++;
    }

    public Person(String ime) {
        name = ime;
        counter++;
    }

    public Person(int age){
        this(null, "", age);
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        counter++;
    }

    /**
     * Funkcije ili metode.
     *
     * non-static
     *
     * MODIFIKATOR_VIDLJIVOSTI POVRATNI_TIP IME_FUNKCIJE(){
     *
     * }
     *
     */
    public void speak(){
        String fullName = getFullName();
        System.out.println(fullName+" zna kako da mnogo priča");
    }

    public void speak(String nacinGovora){
        System.out.println(getFullName()+" priča " + nacinGovora);
    }

    public String getFullName(){
        String punoIme = surname+","+name;
        return punoIme;
    }

    public static void print(){
        System.out.println("Kreirano je "+ counter+" objekata");
    }
}

package six.oop;

/**
 * <p>Koncept KLASA/OBJEKAT</p>
 */
public class Executor {
    public static void main(String[] args) {
        int number = 23;
        number = 13;
        //NIZ -> prvi složeni tip podatka
        //numbers -> varijabla/objektom
        int[] numbers = new int[10];//new
        numbers[0] = 23;//indeksirana
        numbers[1] = 13;
        /**
         * Ograničenje niza:
         * <li>1. svi moraju u varijabli numbers biti int</li>
         * <li>2. fiksna dužina</li>
         */
        System.out.println(Person.counter);// 0
        Person.print();
        Person boris = new Person();//poziv konstruktora
        boris.name = "Borislav";
        boris.surname = "Domazet";
        boris.age = 32;
        System.out.println(boris.counter);// 1
        Person vejsil = new Person();//poziv konstruktora
        vejsil.name = "Vejsil";
        vejsil.surname = "Sarajlić";
        vejsil.age = 34;
        System.out.println(boris.counter);// 2
        System.out.println(vejsil.counter);// 2
        Person mujaga = new Person("Mujaga");//poziv konstruktora 3
        System.out.println(Person.counter);//3
        System.out.println(Person.counter);//3
        System.out.println(Person.counter);//3
        Person albin = new Person(24);
        Person adna = new Person(25);
        Person melisa = new Person("Melisa", "Herović", 23);
        melisa.speak();//Melisa Herović zna kak...
        String punoImeMelisino = melisa.getFullName();
        melisa.speak("TIHO");
        Person.print();
    }
}


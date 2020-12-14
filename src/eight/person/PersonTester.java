package eight.person;

import eight.animal.Animal;
import eight.animal.Snake;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.setName("Amar");
        p1.setSurname("Šabić");
        p1.printNameOfAnimal();
        Animal snake = new Snake("Zmijica");
        p1.setAnimal(snake);
        p1.printNameOfAnimal();
    }
}

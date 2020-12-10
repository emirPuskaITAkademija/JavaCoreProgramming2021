package eight;

import eight.animal.*;
import eight.person.Person;
import eight.person.Student;
import eight.razred.Razred;

public class Tester {
    public static void main(String[] args) {
        //Tip: Object, Person, Student
        Student student1 = new Student();
        Razred razred = new Razred("II-C");
        razred.addStudent(student1);
        Student student2 = new Student();
        razred.addStudent(student2);
        Dog dog = new Dog("Buddy");
        student1.setAnimal(dog);
        Cat cat = new Cat("Cicko");
        student1.setAnimal(cat);
        Hamster hamster = new Hamster("Hrcak neki");
        student1.setAnimal(hamster);
        Fish fish = new Fish("Zlatna ribica");
        student1.setAnimal(fish);
        Bird bird = new Bird("Tweety");
        student1.setAnimal(bird);
        Plane plane = new Plane();

        //Tip: Object, Person, Profesor
        // student1 = new Profesor();
        Tester tester = new Tester();
        tester.executeFlying(bird);
        tester.executeFlying(plane);
        //tester.executeFlying(cat);
        //Flyable ->
        Flyable flyableObject = () -> {
            System.out.println("LEteci objekat...");
        };
        flyableObject.fly();

        //test
        int number1 = 23;
        int number2 = 13;
        System.out.println("Number1 = " + number1);//23
        System.out.println("Number2 = " + number2);//13
        swap(number1, number2);
        System.out.println("Number1 = " + number1);//23
        System.out.println("Number2 = " + number2);//13
        //
        Person person1 = new Person();
        person1.setName("Boris");
        Person person2 = new Person();
        person2.setName("Mujaga");
        System.out.println("Prije SWAP");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        swapPerson(person1, person2);
        System.out.println("Poslije SWAP");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

    static void swap(int broj1, int broj2) {
        System.out.println("POČETAK");
        int temp = broj1;
        broj1 = broj2;
        broj2 = temp;
        System.out.println("Number1 = " + broj1);//13
        System.out.println("Number2 = " + broj2);//23
        System.out.println("KRAJ");
    }

    static void swapPerson(Person p1, Person p2){
        String tempNameP1 = p1.getName();
        p1.setName(p2.getName());
        p2.setName(tempNameP1);
    }

    void executeFlying(Flyable flyable) {
        System.out.println("Sada će da poleti naš leteći objekat");
        flyable.fly();

    }
}

package eight.person;

import eight.animal.Animal;
import eight.animal.Cat;
import eight.animal.Dog;
import eight.animal.Hamster;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Animal animal;


    public Person() {
        super();
        System.out.println("Poziva se konstruktor klase Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null) {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}

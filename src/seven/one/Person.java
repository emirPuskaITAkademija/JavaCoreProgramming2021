package seven.one;

import nine.enumareted.Gender;
import seven.one.animal.Animal;
import seven.one.animal.Cat;
import seven.one.animal.Dog;

public class Person extends Object{
    //POLJA koja pripadaju objektu kreiranom po šablonu neke klase
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private Animal animal;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Poziva se setAge metod klase Person");
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

package eight.person;

import eight.animal.Animal;


public class Person {
    private String name;//String, Scanner, JOptionPane, Integer
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void printNameOfAnimal() {
        if (animal != null) {
            System.out.format("%s %s posjeduje %s%s", name, surname, animal.getName(), System.lineSeparator());
        }else{
            System.out.format("%s %s nema kućnog ljubimca%s", name, surname, System.lineSeparator());

        }
    }
}

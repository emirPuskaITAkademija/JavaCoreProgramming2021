package seven.one;


import seven.one.animal.Animal;
import seven.one.animal.Cat;
import seven.one.animal.Dog;
import seven.one.animal.Fish;

public class Tester {
    public static void main(String[] args) {
        Person student = new Student();
        student.setName("Mujaga");
        student.setSurname("Hadžispahić");
        student.setAge(12);//COMPILE ERROR
       //student.setIndexNumber("MH134444");
        Animal animal = new Cat("Tom");
        animal = new Dog("Felix");
        student.setAnimal(animal);
        Fish fish = new Fish("Ribica");
        student.setAnimal(fish);
    }
}

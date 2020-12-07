package seven.oop;

import seven.Person;

public class Student extends Person {

    public Student() {
        super();
        System.out.println("Poziv STUDENT konstruktora bez PARAM");
    }

    public Student(String param) {
        super(param);
        System.out.println("Poziv Student konstruktora sa jednim parametrom");
    }


    public void print() {
        int age = getAge();
        System.out.println("AGE: " + age);
    }

}

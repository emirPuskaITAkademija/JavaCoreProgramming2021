package eight.razred;

import eight.person.Student;

public class Razred {

    private int lastAvailable = 0;
    private final String identifikator;
    private Student[] students = new Student[30];

    public Razred(String ident){
        this.identifikator = ident;
        System.out.println("Kreira se razred");
    }

    public void addStudent(Student student){
        if(lastAvailable<0 && lastAvailable >=30){
            System.out.println("Nema više mjesta");
        }else{
            students[lastAvailable] = student;
            student.setRazred(this);
            lastAvailable++;
        }
    }


    public String getIdentifikator() {
        return identifikator;
    }
}


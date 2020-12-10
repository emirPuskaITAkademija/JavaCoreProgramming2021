package eight.person;

import eight.razred.Razred;

public class Student extends Person{

    private String indexNumber;
    private Razred razred;

    public Student(){
        super();
        System.out.println("Poziva se konstruktor klase Student");
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setRazred(Razred razred) {
        this.razred = razred;
    }

    public Razred getRazred() {
        return razred;
    }
}

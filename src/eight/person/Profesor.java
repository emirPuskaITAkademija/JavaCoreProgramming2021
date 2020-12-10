package eight.person;

public class Profesor extends Person {

    private double salaryAmount;


    public Profesor() {
        super();
        System.out.println("Poziva se konstruktor klase Profesor");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }


}

package seven.one;

public class Profesor extends Person {

    private double salaryAmount;

    public Profesor() {
        super();
    }

    public void setSalaryAmount(double salaryAmount) {
        if (salaryAmount >0) {
            this.salaryAmount = salaryAmount;
        }
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }
}

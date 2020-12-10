package eight.animal;

public class Bird extends  Animal implements Flyable{

    public Bird(String imePtice){
        super(imePtice);
    }

    @Override
    public void playSound() {
        System.out.println("Hu hu hu");
    }

    @Override
    public void fly() {
        System.out.println("Ptica leti leti..");
    }
}

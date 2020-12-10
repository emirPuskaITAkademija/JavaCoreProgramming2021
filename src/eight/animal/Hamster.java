package eight.animal;

public class Hamster extends Animal {


    public Hamster(String imeHrcka) {
        super(imeHrcka);
    }

    @Override
    public void playSound() {
        System.out.println("hrhrhr...");
    }
}

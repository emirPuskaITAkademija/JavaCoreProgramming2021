package eight.animal;

public class Fish extends Animal {
    public Fish(String imeRibe){
        super(imeRibe);
    }

    @Override
    public void playSound() {
        System.out.println("Glu glu..");
    }
}

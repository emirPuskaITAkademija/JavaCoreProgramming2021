package eight.animal;

public class Dog extends Animal {


    public Dog(String imePsa) {
        super(imePsa);
    }

    @Override
    public void playSound() {
        System.out.println("Waw waw..");
    }
}

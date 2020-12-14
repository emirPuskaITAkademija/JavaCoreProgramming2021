package eight.animal;

public class Snake extends Animal {

    public Snake(String imeZmije){
        super(imeZmije);
    }

    @Override
    public void playSound() {
        System.out.println("Ks ks ks..");
    }
}

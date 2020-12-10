package eight.animal;

public abstract class Animal {

    private String name;

    public Animal(String param){
        this.name = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playSound();
}

package seven.one.animal;

/**
 * 1. Enkapsulacija
 * 2. Nasljeđivanje
 * 3. Polimorfizam
 * 4. Apstrakcija
 */
public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

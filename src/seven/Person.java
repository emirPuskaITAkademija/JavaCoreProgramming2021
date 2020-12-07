package seven;

/**
 * <p>Modifikatori vidljivosti:
 *      <li>1. public </li>
 *      <li>2. bez kljucne rijeci(paketno privatna vidljivost)</li>
 *      <li>3. protected</li>
 *      <li>4. private </li>
 * </p>
 */
public class Person {
    public String name;//public
    String surname;//paketno-privatni
    private int age;
    protected double weight;

    public Person(){
        super();
        System.out.println("Poziva se konstruktor BEZ PARAM klase Person");
    }

    protected Person(String param1){
        this.name = param1;
        System.out.println("Poziva se konstruktor SA NAME PARAM klase Person");
    }

    public void setAge(int age){
        if(age>0 && age <18){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

}

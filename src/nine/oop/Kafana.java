package nine.oop;

public class Kafana {
    public static void main(String[] args) {
        Beverage kafa = new Kafa();
        System.out.println("Račun= " + kafa.cost());
        Beverage kafa1 = new Kafa();
        Beverage kafaMlijeko = new MilkDecorator(kafa1);
        System.out.println("Račun= " + kafaMlijeko.cost());
    }
}

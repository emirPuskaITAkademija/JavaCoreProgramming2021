package nine.enumareted;

import eight.animal.Snake;
import eight.person.Profesor;

/**
 * Koliko ja mogu kreirati objekat tipa Profesor.. ?
 * Open/Close
 */
public class EnumExecutor {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        Snake snake = new Snake("Eustahije brzić");
        profesor.setAnimal(snake);
        //ENUM
        Season ljeto = new Season(6, 9, "Ljeto");
        Season ljeto1 = new Season(6, 9, "Ljeto");
        System.out.println(ljeto.hashCode());//18
        System.out.println(ljeto1.hashCode());//19
        Season jesen= new Season(9, 12, "Jesen");
        Season zima = new Season(12, 3, "Zima");
        Season proljece = new Season(3, 6, "Proljeće");
        Season proljece1 = new Season(3, 6, "Proljeće");
        //klase ili enuma
        SeasonEnum ljetoEnum1 = SeasonEnum.LJETO;
        SeasonEnum ljetoEnum2 = SeasonEnum.LJETO;
        System.out.println("ENUM");
        System.out.println();
        System.out.println(ljetoEnum1.hashCode());
        System.out.println(ljetoEnum2.hashCode());

    }
}

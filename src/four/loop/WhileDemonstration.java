package four.loop;

/**
 * while loop
 * <p>
 * PETLJA(LOOP) -> blok koda koji se ponavlja sve dok je
 * zadovoljen uslov petlje
 */
public class WhileDemonstration {
    public static void main(String[] args) {
        int number = 1;//1. initialization
        while(number<=10){//2. uslov petlje
            System.out.println(number);
            number++;//3. korak petlje
        }
        System.out.println(number);
    }
}

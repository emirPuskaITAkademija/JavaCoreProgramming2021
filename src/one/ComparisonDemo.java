package one;

import java.util.Scanner;

/**
 * Operatori poređenja.
 *
 * 1. == operator poređenja
 * 2. != not equal to
 * 3. >
 * 4. <
 * 5. >=
 * 6. <=
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = new Scanner(System.in).nextInt();
        int value2 = new Scanner(System.in).nextInt();
        boolean uslovJednakosti = value1 == value2;
        if(uslovJednakosti){
            System.out.println("Jednake vrijednosti");
        }
        if(value1 != value2){
            System.out.println("Nejednake vrijednosti");//*
        }
        if(value1 < value2){
            System.out.println("Prva manja od druge");//*
        }
        if(value1 <= value2){
            System.out.println("Prva manja ili jednaka drugoj");//*
        }
        if(value1 > value2){
            System.out.println("Prva veća od druge");
        }
        if(value1 >= value2){
            System.out.println("Prva veća ili jednaka drugoj");
        }

    }
}

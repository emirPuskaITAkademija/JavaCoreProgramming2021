package one;


import java.util.Scanner;

/**
 * Aritmetički operatori:
 * 1. + Additive( tekst spajanje)
 * 2. - Subtraction
 * 3. * Multiplication
 * 4. / Division
 * 5. % Modulo
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        //64
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj:");
        //36
        int broj2 = new Scanner(System.in).nextInt();
        int suma = broj1 + broj2;
        System.out.println("Suma = " + suma);
        int razlika = broj1 - broj2;
        System.out.println("Razlika = " + razlika);
        int product = broj1*broj2;
        System.out.println("Proizvod = " + product);
        int kolicnik = broj1/broj2;
        System.out.println("Količnik = " + kolicnik);
        int moduloRezultat = broj1 % broj2;
        System.out.println("Modulo rezultat = " + moduloRezultat);
    }
}

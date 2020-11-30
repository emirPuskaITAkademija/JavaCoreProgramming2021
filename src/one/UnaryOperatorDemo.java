package one;

/**
 * Unarni operatori:
 * 1. +
 * 2. -
 * 3. INKREMENT ++
 *          POST INKREMENT
 *          PRE INKREMENT
 * 4. DEKREMENT --
 *          POST DEKREMENR
 *          PRE DEKREMENT
 *  5. ! -> logički komplement
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int result = 1;
        System.out.println(++result);// 1
        System.out.println(result);// 2

        result = 1;
        System.out.println(--result);//1 0
        System.out.println(result);//0 0

        boolean uspjeh = false;
        System.out.println(!uspjeh);

    }
}

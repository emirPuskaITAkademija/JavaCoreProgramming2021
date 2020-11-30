package three;

/**
 * Tipovi podataka:
 * <li>1.Prosti ili primitive</li>
 * <li>2. Složeni ili objektni(String, nizovi)</li>
 */
public class StringDemo {
    public static void main(String[] args) {
        //tip ime = vrijednost;
        int number = 13;
        char znak = 'A';
        //znak = '!';
        char sign = 'A';
        sign = '!';
        //tip ime = vrijednost;
        String ime = "Harun ";
        String prezime = "Bucalović";
        //Operator +
        String punoIme = ime + prezime;
        punoIme = punoIme +" Ženino";
        punoIme = "Harun Ženino1 Bucalovič";
        //== -> prostih
        String name1 = "Nevena";//1. String literal
        String name2 = new String("Nevena");//2.
        String name3 = "Nevena";
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
    }
}

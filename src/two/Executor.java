package two;

/**
 * Vrste programskih jezika;
 * <li>1. Statically ili strogo tipizirani</li>
 * <li>2. Slabo tipizirani</li>
 *
 * <p>
 *     Tipovi podataka u programskom jeziku Java:
 *     <li>1. Prosti ili ugrađeni ili primitivni tipovi</li>
 *  *        1.1 byte -> 8 bita
 *  *        1.2 short -> 16 bita
 *  *        1.3 int -> 32 bitni //PODRAZUMIJEVANI CIJELI
 *  *        1.4 long -> 64 bitni
 *  *        1.5 float -> 32 bitni
 *  *        1.6 double -> 64 bitni//PODRAZUIJEVANI decimalni zapis
 *  *        1.7 char ->  16 bitakaraktere u memorijski prostor
 *  *        1.8 boolean -> false ili true
 *    <li>2. Složeni ili objektni </li>
 *           NIZ
 *           String
 * </p>
 */
public class Executor {
    public static void main(String[] args) {
        //TIP_SADRZAJA IME_MEMORIJSKE(varijabla) = VRIJEDNOST_PODATAK;
        byte number1 = 13;
        short number2 = 32767;
        int number3 = 69000;//podrazumijevani cijeli broj
        long number4 = 12324L;
        //AUTOMATSKOJ KONVERZIJI TIPA
        int intNumber = 234;
        long longNumber = intNumber;
        //EKSPLICITNA KONVERZIJA TIPAA
        long longNumber1 = 23456;
        int intNumber1 = (int)longNumber1;


        short br1 = 150;
        short br2 = (short)150.7;
        //int
        int rezultat=br1+br2;


        float floatNumber = 23.9F;
        double doubleNumber = 23.9;

        float nekiBroj = 0.1f;
        double nekiBroj1 = 0.1;
        //BigDecimal
        System.out.println(nekiBroj==nekiBroj1);

        char charVarijabla = '!';
        charVarijabla = 'A';
        char charVarijabla1 = 33;
        System.out.println(charVarijabla1);


        int brojPogadjamo = 0b111;
        System.out.println(brojPogadjamo);
        brojPogadjamo = 0x52;
        System.out.println(brojPogadjamo);
    }
}

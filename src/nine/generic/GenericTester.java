package nine.generic;

import eight.person.Person;
import nine.enumareted.Gender;

/**
 * Tipovi podataka:
 * <li>1. prost</li>
 * <li>2. Složeni
 * <li>2.1 Sirovi složeni</li>
 * <li>2.2 Parametrizirani složeni tipovi</li>
 * </li>
 */
public class GenericTester {
    public static void main(String[] args) {
        //TIP varijabla = podaci;
        int number = 23;
        Gender spol = Gender.FEMALE;
        Person p1 = new Person();
        p1.setName("Elma");
        p1.setAge(13);
        Person p2 = new Person();
        //p1, p2 -> su istog tipa: Person
        //p1 ima name tipa String
        //p2 ima name tipa String
        Box<Gender> kutija1 = new Box<Gender>();//E -> Gender
        kutija1.setPolje(Gender.FEMALE);
        Box<String> kutija2 = new Box<>();//E -> String
        kutija2.setPolje("Elma");
        Box<Integer> kutija3 = new Box<>();//E -> Integer (int)
        kutija3.setPolje(23);
        // kutija1, kutija2, kutija3, kutija4 -> su istog tipa : Box
        //kutija1 ima polje tipa Gender
        //kutija2 ima polje tipa String
        //kutija3 ima polje tipa Integer
        //kutija4 ima polje tipa Object
        Box kutija4 = new Box();//1.4
        kutija4.setPolje(p1);
    }
}

package one;
//+ -> zbrajanje
// ==
public class StringDemo {
    public static void main(String[] args) {
        String ime = "Harun ";
        String prezime = "Bucalović";
        String result = ime+prezime;
        System.out.println(result);

        String name1 = "Emir";
        String name2 = new String("Emir");
        String name3 = "Emir";
        //==
        System.out.println(name1 == name3);
    }
}

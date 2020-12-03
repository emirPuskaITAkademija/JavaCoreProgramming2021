package six;

/**
 *
 * <p>Postavka zadatka:</p>
 * <li>1. String recenica = "Tražim koliko se puta Adi nasmijao. Adi je zaista zabavan tip.</li>
 * <li>2. String rijec = "Adi"</li>
 * <p>
 *     Zadatak:
 *     <li>1. Napisati program koji provjerava : DA LI JE RIJEČ sdržana u REČENICI</li>
 *     <li>2. Koliko se puta RIJEČ ponavlja u rečenici.</li>
 * </p>
 *
 * TIP varijabla = podatak;
 *
 */
public class ContinueLabelDemo {
    public static void main(String[] args) {
        //postavka zadatka
        String recenica = "Tražim koliko se puta Adi nasmijao. Adi je zaista zabavan tip.";
        String rijec = "Adi";
        //ZADATAK ->
        boolean imaLiAdija = false;
        int brojac = 0;
        //NIZ -> String - po definiciji je niz karaktera
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();//3 -> 0= A, 1 = d, 2 = i
        //IZRADA zadatka
        Jabuka:for(int i = 0; i<recenicaNiz.length; i++){
            // i = 0
            int k = i;
            for(int j = 0; j<rijecNiz.length; j++){// j = 0, 1, 2 -> k = 0, 1, 2
                char slovoRecenica = recenicaNiz[k++];
                char slovoRijec = rijecNiz[j];
                if(slovoRecenica != slovoRijec){
                    continue Jabuka;
                }
            }
            imaLiAdija = true;
            brojac++;
        }

        String poruka = imaLiAdija ?"Pronađena":"Nije pronađena";
        System.out.println(poruka);
        if(imaLiAdija){
            //escape characters -> bdomazet88@gmail.com
            String poruka2 = String.format("Riječ '%s' se u rečenici '%s' ponavlja '%d' puta", rijec, recenica, brojac);
            System.out.println(poruka2);
        }

    }
}

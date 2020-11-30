package four;

import javax.swing.*;

/**
 * Program: pušta korisnika da unese:
 * <li>1. redni broj mjeseca u godini</li>
 * <li>2. broj godine(28, 29)</li>
 * <p>
 * Rezultat: program izbaci koliko dati mjesec ima dana.
 * <li>  4 -> 28, 29, 30, 31</li>
 * </p>
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //ULAZ u naš program
        String redniBrojMjesecaText = JOptionPane.showInputDialog("Unesi redni broj mjeseca:");
        int redniBrojMjesec = Integer.parseInt(redniBrojMjesecaText);
        String brojGodineText = JOptionPane.showInputDialog("Unesi broj godine:");
        int brojGodine = Integer.parseInt(brojGodineText);
        //LOGIKA PROGRAMA
        int brojDanaUMjesecu = 0;//4 rezultata -> 28, 29, 31, 30
        switch (redniBrojMjesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;
            case 2:
                //Godine djeljive sa 4 a NE sa 100 -> ==0 && !=0
                boolean condition1 = brojGodine % 4 == 0 && brojGodine % 100 != 0;
                //DODAJU se i one djeljive sa 400 -> ==0
                boolean condition2 = brojGodine % 400 == 0;
                boolean prestupna = condition1 || condition2;
                if (prestupna) {
                    brojDanaUMjesecu = 29;
                } else {
                    brojDanaUMjesecu = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Godina ima 12 mjeseci");
                break;
        }
        //Korisniku prikazati izlaz iz programa
        String message = "Za uneseni mjesec '"
                + redniBrojMjesec +
                "' i godinu '" +
                brojGodine +
                "' broj dana u mjesecu je '"
                + brojDanaUMjesecu + "'";
        String message1 = String.format("Za uneseni mjesec '%s' i godinu '%s' broj dana u mjesecu '%s'",redniBrojMjesec, brojGodine, brojDanaUMjesecu );
        JOptionPane.showMessageDialog(null, message1);

    }
}

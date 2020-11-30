package five;

import javax.swing.*;

/**
 * <li>1. Prost ili primitivni -> 8</li>
 * <li>2. Niz a zatim String</li>
 */
public class ContinueDemo {
    public static void main(String[] args) {
        String text = "petar pan je pojeo pancakes";
        char[] nizKaraktera = text.toCharArray();//ime varijable određenog tipa
        int brojac = 0;
        for(int i = 0; i<nizKaraktera.length; i++){
            char karakter = nizKaraktera[i];
            if(karakter != 'p'){
                continue;
            }
            brojac++;
        }
        //ime tipa
        String poruka =  String.format("Broj ponavljanja slova p je '%s'", brojac);
        JOptionPane.showMessageDialog(null, poruka);
    }
}

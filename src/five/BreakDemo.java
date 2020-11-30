package five;

import javax.swing.*;

/**
 *  <li>1. break inside loop</li>
 *  <li>2. break with LABEL inside loop</li>
 *  <li>3. continue inside loop</li>
 *  <li>4. continue with LABEL inside loop</li>
 *
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] brojevi = {23, 13, 234, 456, 678, 12, 2000, 111};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi broj i okušaj sreću");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean postojiBroj = false;
        for(int broj: brojevi){
            if(broj==uneseniBroj){
                postojiBroj = true;
                break;
            }
        }
        String poruka =postojiBroj  ? "Sretan":"Nesretan";
        JOptionPane.showMessageDialog(null, poruka);
    }
}

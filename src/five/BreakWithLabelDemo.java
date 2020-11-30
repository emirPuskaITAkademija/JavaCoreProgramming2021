package five;

import javax.swing.*;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] brojevi = {
                {12, 23, 456,},//0
                {13, 2076, 2000, 8}, //1
                {987, 45, 234, 10}//2
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi broj i okušaj sreću");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean postojiBroj = false;
        //PROGRAM
        labela: for (int i = 0; i < brojevi.length; i++) {
            int[] elementNiza = brojevi[i];//i=0 -> element = {12, 23, 456}
            for (int j = 0; j < elementNiza.length; j++) {
                int broj = brojevi[i][j];
                if(broj == uneseniBroj){
                    postojiBroj = true;
                    break labela;
                }
            }
        }
    }
}

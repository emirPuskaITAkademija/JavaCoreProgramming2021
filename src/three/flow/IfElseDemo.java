package three.flow;

import javax.swing.*;

/**
 * Kontrola toka:
 * <li>1. if-then, if-then-else, switch-case</li>
 */
public class IfElseDemo {
    public static void main(String[] args) {
        String brojPoenaString = JOptionPane.showInputDialog("Broj poena");
        int brojPoena = Integer.parseInt(brojPoenaString);
        char ocjena;
        if(brojPoena>=90){
            ocjena = 'A';
        }else if(brojPoena >= 80){
            ocjena = 'B';
        }else if(brojPoena >=70){
            ocjena = 'C';
        }else if(brojPoena >= 60){
            ocjena = 'D';
        }else{
            ocjena = 'E';
        }
        JOptionPane.showMessageDialog(null, "Ocjena na ispitu " + ocjena);
    }
}

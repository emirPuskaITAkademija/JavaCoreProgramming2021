package three.flow;

import javax.swing.*;

//switch -case -break
//switch -case - bez break
public class SwitchCaseDemo {
    public static void main(String[] args) {
        String brojDanaText = JOptionPane.showInputDialog("Unesi 1-7");
        int brojDana = Integer.parseInt(brojDanaText);
        String imeDana;
        switch (brojDana) {
            case 1:
                imeDana = "Monday";
                break;
            case 2:
                imeDana = "Tuesday";
                break;
            case 3:
                imeDana = "Wednesday";
                break;
            case 4:
                imeDana = "Thursday";
                break;
            case 5:
                imeDana = "Friday";
                break;
            case 6:
                imeDana = "Saturday";
                break;
            case 7:
                imeDana = "Sunday";
                break;
            default:
                imeDana = "Sedmica ima 7 dana zato i jeste sedmica";
                break;
        }
        JOptionPane.showMessageDialog(null, imeDana);
    }
}

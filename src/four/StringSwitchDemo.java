package four;

import javax.swing.*;
//Kontrola toka ->
public class StringSwitchDemo {
    public static void main(String[] args) {
        //Java 7 >=
        //1. try-with-resource
        //2. switch -> prima ne samo broj nego i String
        String imeDana = JOptionPane.showInputDialog("Unesi ime dana u sedmici");
        int redniBrojDana;
        //1.7 -> Java je CASE SENSITIVE
        String imeDanaNeosjetljivo = imeDana.toLowerCase();
        switch(imeDanaNeosjetljivo){
            case "monday":
                redniBrojDana = 1;
                break;
            case "tuesday":
                redniBrojDana = 2;
                break;
            case "wednesday":
                redniBrojDana = 3;
                break;
            case "thursday":
                redniBrojDana = 4;
                break;
            case "friday":
                redniBrojDana = 5;
                break;
            case "saturday":
                redniBrojDana = 6;
                break;
            case "sunday":
                redniBrojDana = 7;
                break;
            default:
                redniBrojDana = 0;
                break;
        }
        // ? -> if-else
        String poruka = redniBrojDana == 0 ?
                "Ne postoji dan u Engleskom jeziku s imenom "+imeDana:
                "Dan s imenom " + imeDana+" je "+redniBrojDana+" po redu";
        JOptionPane.showMessageDialog(null, poruka);
    }
}

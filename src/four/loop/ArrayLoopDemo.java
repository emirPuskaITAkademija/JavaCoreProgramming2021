package four.loop;

import java.util.Arrays;

/**
 * <li>LOOPS ili PETLJE
 * <li>2. NIZOVA</li>
 */
public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] names = {"Adi", "Almir", "Nevena", "Amer", "Harun", "Jasmin", "Damir",
        "Ajša", "Emil", "Adna", "Emir"};
        /*int i = 0;//initialization
        while(i<names.length){
            String name = names[i];
            System.out.println(name);
            i++;
        }*/
        /*for(int i = 0; i<names.length; i++){
            String name = names[i];
            System.out.println(name);
        }*/
        //ENHANCED FOR LOOP --> Java
        for(String name: names) {
            System.out.println(name);
        }

    }
}

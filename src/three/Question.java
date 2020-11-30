package three;

public class Question {
    public static void main(String[] args) {
        String[] sviRazredi = new String[2];
        String[] dodajRazred = new String[2];
        //1.
        String[][] niz1 = new String[2][2];
        niz1[0][0] = "Gospođa";
        niz1[0][1] = "Gospodin";
        niz1[1][0] = "Smith";
        niz1[1][1] = "Jones";
        System.out.println(niz1.length);
        String[] elementPrvi = niz1[0];
        System.out.println(niz1[0].length);
        //2
        String[][] niz2 = {
                {"Gospodin", "Gospođa",},//0
                {"Smith", "Jones"},//1
        };
        String gđa = niz2[0][1]+" "+niz2[1][1];
        System.out.println(gđa);
    }
}

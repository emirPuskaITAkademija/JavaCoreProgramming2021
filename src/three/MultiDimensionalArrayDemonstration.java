package three;

public class MultiDimensionalArrayDemonstration {
    public static void main(String[] args) {
        String[] imena = new String[15];
        imena[0] = "Mirnes";
        imena[1] = "Adi";
        imena[2] = "Irfan";
        imena[3] = "Harun";
        imena[4] = "ALmir";
        imena[5] = "Nevena";
        String[] imena1 = {"Jedan", "Dva"};
        //VIŠEDIMENZIONALNI NIZ
        String[][] names = {
             //0 -> niz
                {"Gospodin", "Gospođa"},
                //1 ->
                {"Smith", "Jones"},

        };
        String gđa = names[0][1]+ " " + names[1][1];
        System.out.println(gđa);
        String gdin = names[0][0]+" " + names[1][0];
        System.out.println(gdin);
    }
}

package nine.enumareted;

public enum Gender {

    //OBJEKTI
    FEMALE, MALE, UNKNOWN;
    //DEFINICIJA
    private Gender(){
        System.out.println("Poziva se konstruktor Gender");
    }
}

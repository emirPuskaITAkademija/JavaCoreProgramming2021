package nine.enumareted;

public enum SeasonEnum {
    //OBJEKTI enuma
    LJETO(6, 9, "Ljeto"),
    JESEN(9, 12, "Jesen"),
    ZIMA(12, 3, "Zima"),
    PROLJEĆE(3, 6, "Proljeće");
    //DEFINICIJA
    private final int startMonth;
    private final int endMonth;
    private final String name;

    private SeasonEnum(int startMonth, int endMonth, String name) {
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public static void something(){

    }
}

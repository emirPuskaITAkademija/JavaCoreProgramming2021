package nine.enumareted;

public class Season {
    private final int startMonth;
    private final int endMonth;
    private final String name;

    public Season(int startMonth, int endMonth, String name) {
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
}

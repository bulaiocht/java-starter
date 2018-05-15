package lesson13;


public enum DayEnums {
    //Singletone
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    TAB("\t");


    private String regex;
    private int value;

    DayEnums(String regex) {
        this.regex = regex;
    }

    DayEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        switch (this) {
            case FRIDAY:
                return name() + value;
            case MONDAY:
                return "Monday: " + value;
            case SATURDAY:
                return "Saturday: " + value;
            case SUNDAY:
                return "Sunday: " + value;
            case THURSDAY:
                return "Thursday: " + value;
            case TUESDAY:
                return "Tuesday: " + value;
            case WEDNESDAY:
                return "Wednesday: " + value;
            default:
                return null;
        }
}
}

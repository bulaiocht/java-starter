package ok.lesson2;

public class Switch {

    public static void main(String[] args) {

        final int CASE_INT = 11;

        int x = 5;

        String dayString = "";

        switch (x)
        {
            case 1: dayString = "Monday";
                break;
            case 2: dayString = "Tuesday";
                break;
            case 3: dayString = "Wednesday";
                break;
            case 4: dayString = "Thursday";
                break;
            case 5: dayString = "Friday";
                break;
            case 6: dayString = "Saturday";
                break;
            case 7: dayString = "Sunday";
                break;
            case CASE_INT: dayString = "WHAT?";
                break;
            default: dayString = "This day of week doesn't exist!";
        }

        System.out.println(dayString);
    }
}

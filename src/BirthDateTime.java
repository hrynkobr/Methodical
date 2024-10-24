import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the year of birth
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Get the month of birth
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Get the day of birth
        int day = 0;
        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            default: // January, March, May, July, August, October, December
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
        }

        // Get the hour of birth
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

        // Get the minute of birth
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        // Print the birth date and time
        System.out.println("\nYou were born on: " + year + "/" + month + "/" + day + " at " + hour + ":" + minute);
    }
}
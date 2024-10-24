import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get a SSN from the user
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn);

        // Get a UC Student M number from the user
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M##### or m#####): ", "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number: " + mNumber);

        // Get a menu choice from the user
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, Q): ", "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);
    }
}
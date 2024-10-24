import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for their favorite integer
        int favInt = SafeInput.getRangedInt(in, "Enter your favorite integer: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Your favorite integer is: " + favInt);

        // Prompt the user for their favorite double
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favDouble);
    }
}
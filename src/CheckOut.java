import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            // Prompt for the price of the item
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item (.50 to 10.00): ", 0.50, 10.00);
            totalCost += price;

            // Ask if they have more items
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to enter?");
        } while (moreItems);

        // Display the total cost with 2 decimal places
        System.out.printf("The total cost of the items is: $%.2f\n", totalCost);
    }
}
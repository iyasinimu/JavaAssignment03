import java.util.Scanner;

public class E523_CouponGiveaway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount spent on groceries: $");
        double amountSpent = scanner.nextDouble();
        double totalAmountSpent = 0;

        if (amountSpent < 10) {
            System.out.println("No coupon");
        }
        else if (amountSpent <= 60) {
            totalAmountSpent = amountSpent * 0.08;
        }
        else if (amountSpent <= 150) {
            totalAmountSpent = amountSpent * 0.10;
        }
        else if (amountSpent <= 210) {
            totalAmountSpent = amountSpent * 0.12;
        }
        else {
            totalAmountSpent = amountSpent * 0.14;
        }
        System.out.println(totalAmountSpent);
    }
}

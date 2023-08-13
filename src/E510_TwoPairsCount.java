import java.util.Scanner;

public class E510_TwoPairsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any four integer number : ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int count = 0;

        if (number1 == number2) {
            count = count + 1;
        }
        if (number1 == number3) {
            count = count + 1;
        }
        if (number1 == number4) {
            count = count + 1;
        }
        if (number2 == number3) {
            count = count + 1;
        }
        if (number2 == number4) {
            count = count + 1;
        }
        if (number3 == number4) {
            count = count + 1;
        }

        if (count == 2) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
    }
}

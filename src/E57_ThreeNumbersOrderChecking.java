import java.util.Scanner;

public class E57_ThreeNumbersOrderChecking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three integer number : ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}

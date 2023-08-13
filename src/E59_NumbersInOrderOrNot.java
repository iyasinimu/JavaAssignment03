import java.util.Scanner;

public class E59_NumbersInOrderOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three integer number : ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ((number1 < number2 && number2 < number3) || (number1 > number2 && number2 > number3)) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }
    }
}

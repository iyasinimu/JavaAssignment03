import java.util.Scanner;

public class E517_LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three floating point numbers : ");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        System.out.println("The largest number is : ");
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number1 < number2 && number2 > number3) {
            System.out.println(number2);
        } else if (number1 < number3 && number2 < number3){
            System.out.println(number3);
        }
    }
}


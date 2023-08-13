import java.util.Scanner;

public class E52_ClassifyingFloatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any floating-point number : ");

        double number = scanner.nextDouble();

        if (number < 0){
            System.out.println("negative");
        }
        else if (number > 0){
            System.out.println("positive");
        }
        else{
            System.out.println("zero");
        }

        double absValue = Math.abs(number);
        if (absValue < 1) {
            System.out.println("small");
        } else if (absValue > 1000000) {
            System.out.println("large");
        }
    }
}

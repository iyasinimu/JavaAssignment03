import java.util.Scanner;

public class E51_ClassifyingIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number : ");

        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("The number is obviously negative");
        }
        else if (number > 0){
            System.out.println("The number is obviously positive");
        }
        else{
            System.out.println("The number is obviously zero");
        }
    }
}

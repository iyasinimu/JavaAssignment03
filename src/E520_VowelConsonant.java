import java.util.Locale;
import java.util.Scanner;

public class E520_VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any single character : ");
        String input = scanner.nextLine();
        input = input.toUpperCase();
        if (input.length() != 1) {
            System.out.println("Error");
        } else {
            char character = input.charAt(0);
            if ((character >= 'A' && character <= 'Z')) {
                if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error");
            }
        }
    }
}


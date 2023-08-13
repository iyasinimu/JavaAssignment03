import java.util.Scanner;

public class E54_ComparingFirstLastLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string : ");

        String inputString = scanner.nextLine();

        char firstLetter = inputString.charAt(0);
        char lastLetter = inputString.charAt(inputString.length()-1);

        if (firstLetter == lastLetter){
            System.out.println("first and last letter same");
        }
        else{
            System.out.println("first and last letter different");
        }
    }
}

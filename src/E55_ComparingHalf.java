import java.util.Scanner;

public class E55_ComparingHalf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string : ");

        String inputString = scanner.nextLine();

        String firstHalf = inputString.substring(0,inputString.length()/2);
        String lastHalf = inputString.substring(inputString.length()/2);

        if (firstHalf.equals(lastHalf)){
            System.out.println("first and last half same");
        }
        else{
            System.out.println("first and last half different");
        }
    }
}

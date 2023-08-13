import java.util.Scanner;

public class E56_ThreeDifferentNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three integer number : ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ( number1 == number2 && number2 == number3 && number3 == number1 ){
            System.out.println("all the same");
        }
        else if ( number1 != number2 && number2 != number3 && number3 != number1){
            System.out.println("all different");
        }
        else {
            System.out.println("neither");
        }
    }
}

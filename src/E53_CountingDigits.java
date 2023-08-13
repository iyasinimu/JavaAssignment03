import java.util.Scanner;

public class E53_CountingDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number : ");

        int number = scanner.nextInt();

        if (number < 0){
            number = number * (-1) ;
        }

        int count = 0;

        if (number == 0){
            count = 1;
            }

        else  {
            while (number > 0) {
                number = number / 10;
                count = count + 1;
            }
        }
        System.out.println(" The total count of the digits is : " + count);
        }
}

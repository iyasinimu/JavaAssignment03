import java.util.Scanner;

public class E521_Month {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any month by it's sequnce 1, 2, 3..., 12: ");
            int month = scanner.nextInt();
            int days;

            switch (month) {
                case 2:
                    days = 28;
                    System.out.println("February has " + days + " days.");
                    break;
                case 4 , 6 , 9 , 11:
                    days = 30;
                    System.out.println("Month " + month + " has " + days + " days.");
                    break;
                default:
                    days = 31;
                    System.out.println("Month " + month + " has " + days + " days.");
            }
        }
    }


import java.util.Scanner;

public class E514_NumericGradeToLetters {

    public static String getLetterGrade(double numericValue) {
        if (numericValue >= 3.95 && numericValue <= 4.00) {
            return "A+";
        } else if (numericValue >= 3.85 && numericValue <= 4.00) {
            return "A";
        } else if (numericValue >= 3.45 && numericValue <= 4.00) {
            return "A-";
        } else if (numericValue >= 3.15 && numericValue <= 4.00) {
            return "B+";
        } else if (numericValue >= 2.85 && numericValue <= 4.00) {
            return "B";
        } else if (numericValue >= 2.45 && numericValue <= 4.00) {
            return "B-";
        } else if (numericValue >= 2.15 && numericValue <= 4.00) {
            return "C+";
        } else if (numericValue >= 1.85 && numericValue <= 4.00) {
            return "C";
        } else if (numericValue >= 1.45 && numericValue <= 4.00){
            return "C-";
        } else if (numericValue >= 1.15 && numericValue <= 4.00) {
            return "D+";
        } else if (numericValue >= 0.85 && numericValue <= 4.00) {
            return "D";
        } else if (numericValue >= 0.45 && numericValue <= 4.00) {
            return "D-";
        } else if (numericValue == 0.00 && numericValue <= 4.00) {
            return "F";
        } else {
            return "Invalid";
        }
    }

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numeric value between 0 and 4 : ");
        double numericValue = scanner.nextDouble();
        String letterGrade = getLetterGrade(numericValue);

        System.out.println("The letter grade of the numeric value is " + letterGrade );
    }
}


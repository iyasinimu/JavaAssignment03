import java.util.Scanner;

public class E522_PayCheck {

    private String employee;
    private double wagePerHour;
    private double workingHour;

    public E522_PayCheck(String name, double wage, double hours) {
        employee = name;
        wagePerHour = wage;
        workingHour = hours;
    }

    public void printPaycheck() {
        double regularPay;
        double overtimePay = 0;


        if (workingHour <= 40) {
            regularPay = workingHour * wagePerHour;
        } else {
            regularPay = 40 * wagePerHour;
            overtimePay = (workingHour - 40) * wagePerHour * 1.5;
        }

        double totalPay = regularPay + overtimePay;

        System.out.println("Paycheck for : " + employee);
        System.out.println("Regular hours : " + workingHour + " hours");
        if (workingHour > 40) {
            System.out.println("Overtime hours : " + (workingHour - 40) + " hours");
        }
        System.out.println("Regular pay : $" + regularPay);
        System.out.println("Overtime pay : $" + overtimePay);
        System.out.println("Total pay : $" + totalPay);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        E522_PayCheck paycheck = new E522_PayCheck(name, hourlyWage, hoursWorked);
        paycheck.printPaycheck();
    }
}
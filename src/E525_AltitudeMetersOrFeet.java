import java.util.Scanner;

public class E525_AltitudeMetersOrFeet {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any altitude: ");
            double altitude = scanner.nextDouble();

            System.out.print("Enter 'M' for meters or 'F' for feet: ");
            char unit = scanner.next().charAt(0);
            if (unit == 'F' || unit == 'f') {
                altitude = altitude * 0.3048;
            }
            double boilingPoint = 100 - (altitude / 300);

            String waterState;
            if (boilingPoint <= 0) {
                waterState = "solid";
            }
            else if (boilingPoint < 100) {
                waterState = "liquid";
            }
            else {
                waterState = "gaseous";
            }
            System.out.println("Water is in the " + waterState + " state at an altitude of " +
                    altitude + " meters.");
            System.out.println("Adjusted boiling point of water: " + boilingPoint + " degrees Celsius.");
        }
    }


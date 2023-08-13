import java.util.Scanner;

public class E511_Compass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the angle (degrees): ");
        int angle = scanner.nextInt();

        final int THREEHUNDREDSIXTY = 360 ;
        final int ZERO = 0 ;
        final int FORTYFIVE = 45 ;
        final int NINETY = 90 ;
        final int ONEHUNDREDTHIRTYFIVE = 135 ;
        final int ONEHUNDREDEIGHTY = 180 ;
        final int TWOHUNDREDTWENTYFIVE = 225 ;
        final int TWOHUNDREDSEVENTY = 270 ;
        final int THREEHUNDREDFIFTEEN = 315 ;

        angle = ((angle % THREEHUNDREDSIXTY) + THREEHUNDREDSIXTY) % THREEHUNDREDSIXTY;


        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] directionAngles = {ZERO, FORTYFIVE, NINETY, ONEHUNDREDTHIRTYFIVE, ONEHUNDREDEIGHTY, TWOHUNDREDTWENTYFIVE, TWOHUNDREDSEVENTY, THREEHUNDREDFIFTEEN};

        int nearestDirection = 0;
        int minDifference = Math.abs(angle - directionAngles[0]);

        for (int index = 1; index < directionAngles.length; index++) {
            int difference = Math.abs(angle - directionAngles[index]);
            if (difference < minDifference) {
                minDifference = difference;
                nearestDirection = index;
            }
        }
        System.out.println("Nearest compass direcion :" + nearestDirection);
    }
}

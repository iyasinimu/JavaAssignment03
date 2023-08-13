import java.util.Scanner;

public class E516_Cards {

    private String notation ;

    public E516_Cards(String notation){
        this.notation = notation;
    }
    public String getDescription(){
        if (notation.length() != 2) {
            return "Unknown" ;
        }

        char rankSymbol = notation.charAt(0);
        char suitSymbol = notation.charAt(1);
        char secondChar = notation.charAt(1);

        String rank = "";
        String suit = "";


        switch (rankSymbol) {
            case 'A':
                rank = "Ace";
                break;
            case '2':
                rank = "Two";
                break;
            case '3':
                rank = "Three";
                break;
            case '4':
                rank = "Four";
                break;
            case '5':
                rank = "Five";
                break;
            case '6':
                rank = "Six";
                break;
            case '7':
                rank = "Seven";
                break;
            case '8':
                rank = "Eight";
                break;
            case '9':
                rank = "Nine";
                break;

            case '0':
                if (notation.length() == 3) {
                    if ( rankSymbol == '1' && secondChar == '0') {
                        rank = "Ten";
                    } else {
                        return "Unknown";
                    }
                }
                break;

            case 'J':
                rank = "Jack";
                break;
            case 'Q':
                rank = "Queen";
                break;
            case 'K':
                rank = "King";
                break;
            default:
                return "Unknown";
        }

        switch (suitSymbol) {
            case 'D':
                suit = "Diamonds";
                break;
            case 'H':
                suit = "Hearts";
                break;
            case 'S':
                suit = "Spades";
                break;
            case 'C':
                suit = "Clubs";
                break;
            default:
                return "Unknown";
        }

        return rank + " of " + suit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any card notation: ");
        String notation = scanner.nextLine();

        E516_Cards card = new E516_Cards(notation);
        String description = card.getDescription();

        System.out.println(description);
    }
}





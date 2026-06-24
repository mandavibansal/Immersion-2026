import java.util.Scanner;

class Game {
    private Scanner sc = new Scanner(System.in);

    // Cards for numbers 1-20
    private int[][] cards = {
        {1,3,5,7,9,11,13,15,17,19},
        {2,3,6,7,10,11,14,15,18,19},
        {4,5,6,7,12,13,14,15,20},
        {8,9,10,11,12,13,14,15},
        {16,17,18,19,20}
    };

    private int[] cardValues = {1, 2, 4, 8, 16};

    public void showMenu() {
        System.out.println("\n===== Secret Number Puzzle Game =====");
        System.out.println("1. View Rules");
        System.out.println("2. Display Cards");
        System.out.println("3. Play Game");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
    }

    public void displayRules() {
        System.out.println("\n===== Rules =====");
        System.out.println("1. Think of a number between 1 and 20.");
        System.out.println("2. The system will show 5 cards.");
        System.out.println("3. Answer Y if your number is present.");
        System.out.println("4. Answer N if your number is not present.");
        System.out.println("5. The system will guess your number.");
    }

    public void displayCards() {
        System.out.println("\n===== Secret Number Cards =====");

        for (int i = 0; i < cards.length; i++) {
            System.out.println("\nCard " + (i + 1) +
                    " (Value = " + cardValues[i] + ")");
            for (int num : cards[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void playGame() {
        System.out.println("\nThink of a number between 1 and 20.");

        int secretNumber = 0;

        for (int i = 0; i < cards.length; i++) {

            System.out.println("\nCard " + (i + 1));
            for (int num : cards[i]) {
                System.out.print(num + " ");
            }

            String response;

            while (true) {
                System.out.print("\nIs your number present in this card? (Y/N): ");
                response = sc.next().trim().toUpperCase();

                if (response.equals("Y") || response.equals("N")) {
                    break;
                }

                System.out.println("Invalid input! Enter Y or N.");
            }

            if (response.equals("Y")) {
                secretNumber += cardValues[i];
            }
        }

        System.out.println("\nYour Secret Number is: " + secretNumber);
    }
}

public class secretNumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        while (true) {
            game.showMenu();

            int choice;

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice!");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    game.displayRules();
                    break;

                case 2:
                    game.displayCards();
                    break;

                case 3:
                    game.playGame();
                    break;

                case 4:
                    System.out.println("Thank you for playing!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
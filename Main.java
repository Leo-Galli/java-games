import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("=== Game Selector ===");
            System.out.println("1. Play Flappy Bird");
            System.out.println("0. Exit");
            System.out.print("Select a game (enter the number): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Run the Flappy Bird game
                    System.out.println("Launching Flappy Bird...");
                    try {
                        Flappy_Bird.FlappyBird.main(null); // Call the main method in FlappyBird
                    } catch (Exception e) {
                        System.out.println("Error: Could not launch Flappy Bird.");
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("Exiting the Game Selector. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}

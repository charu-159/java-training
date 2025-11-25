package java2;
import java.util.Scanner;
import java.util.Random;

public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");

        while (true) {
            System.out.print("\nYour choice (0/1/2 or -1 to exit): ");
            int userInput = sc.nextInt();

            if (userInput == -1) {
                System.out.println("Game exited. Thanks for playing!");
                break;
            }

            if (userInput < 0 || userInput > 2) {
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
                continue;
            }

            int computerInput = random.nextInt(3);

            System.out.println("You chose: " + choices[userInput]);
            System.out.println("Computer chose: " + choices[computerInput]);

            if (userInput == computerInput) {
                System.out.println("Result: It's a Draw!");
            } else if ((userInput == 0 && computerInput == 2) ||
                    (userInput == 1 && computerInput == 0) ||
                    (userInput == 2 && computerInput == 1)) {
                System.out.println("Result: You Win! 🎉");
            } else {
                System.out.println("Result: Computer Wins! 🤖");
            }
        }

        sc.close();
    }
}
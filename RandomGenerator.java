import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
    public static void main(String[] args) {
        int ans, userGuess;
        int maxTry = 5;

        final int MAX = 100;

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        do {
            ans = rand.nextInt(MAX) + 1;
            int attempts = 0;

            while (attempts < maxTry) {
                System.out.print("Guess the number between 1 to 100 : ");
                userGuess = sc.nextInt();

                if (userGuess == ans) {
                    System.out.println("Good Job! You won. ");
                    break;
                } else if (userGuess < ans) {
                    System.out.println("Sorry, the answer is greater");
                } else {
                    System.out.println("Sorry, the answer is smaller");
                }

                attempts++;
            }

            if (attempts == maxTry) {
                System.out.println("You lost! The actual answer was: " + ans);
            }

            System.out.println("Do you want to continue? (1 for yes, 0 for no)");
        } while (sc.nextInt() == 1);

        System.out.println("Thanks for playing!");
        sc.close();
    }
}

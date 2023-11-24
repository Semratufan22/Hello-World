import java.util.Random;
import java.util.Scanner;

public class MagicNumberGame {

    public static void main(String[] args) {
        int attemps = 0;
        int finalAttemps = 12;
        // This is the standard pseudo-random number generator
        Random random = new Random();
        int magicNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 10

        // The scanner is a standard functionality that can read from an input stream,
        //   in this case your terminal (console)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic Number Game!");
        System.out.print("You have a maximum of 12 guesses to find the number between 1 and 100. ");

        // we can use the scanner to read 'typed' values from the input.


        while (finalAttemps < 12) {
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();
            System.out.println("Try again, please");
            attemps++;


            // compare magicNumber and userGuess
            if (magicNumber == userGuess) {
                if (magicNumber <= userGuess) {
                    System.out.println("It s too high");// tell the player they guessed it
                }
                System.out.println("Good job!");
            } else {
                // tell the player they didn't guess it
                System.out.println("Nope, that's not it!");
            }

            // close the scanner at the end of your program

        }
    }
}
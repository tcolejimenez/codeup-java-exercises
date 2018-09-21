import java.util.Scanner;

public class HighLow {
    /* Game Development 101
     *
     * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
     * The specs for the game are:
     *
     * Game picks a random number between 1 and 100.
     * Prompts user to guess the number
     * All user inputs are validated
     * If user's guess is less than the number, it outputs "HIGHER"
     * If user's guess is more than the number, it outputs "LOWER"
     * If a user guesses the number, the game should declare "GOOD GUESS!"
     * Use the random method of the java.lang.Math class to generate a random number.

     *Bonus
     * Keep track of how many guesses a user makes
     * Set an upper limit on the number of guesses
     * */

    public static void main(String[] args) {

        //     * Game picks a random number between 1 and 100.
        //     * Use the random method of the java.lang.Math class to generate a random number.

        char continuePlaying = 'y';

        do {
            int winner = (int) Math.floor(Math.random() * 100) + 1;
            System.out.println("Secret winner is: " + winner);
            int guess = getGuess();
            while (!testGuess(guess, winner)) {
                guess = getGuess();
            }


            System.out.println("Play again? (y/n)");

            Scanner input = new Scanner(System.in);
            continuePlaying = input.next().charAt(0);
        } while (continuePlaying != 'n');


    }
    //     * Prompts user to guess the number
    public static int getGuess() {
        String guess;
        int inputAttempts = 0;
        do {
            if (inputAttempts > 0) System.out.println("Invalid input! Please only use integers, no decimals, letters, or symbols.");
            System.out.println("Guess a number between 1 & 100: (integers only)");
            Scanner input = new Scanner(System.in);
            guess = input.next();
            inputAttempts++;
        } while (!validateGuess(guess));

        return Integer.valueOf(guess);
    }

    //     * All user inputs are validated
    public static boolean validateGuess(String guess) {
        if (guess.length() == 0 || !guess.matches("[0-9]+"))
            return false;
        else if (Integer.valueOf(guess) > 100 || Integer.valueOf(guess) < 1)
            return false;
        else
            return true;
    }

    //     * If user's guess is less than the number, it outputs "HIGHER"
    //     * If user's guess is more than the number, it outputs "LOWER"
    //     * If a user guesses the number, the game should declare "GOOD GUESS!"
    public static boolean testGuess(int guess, int winner) {
        if (guess < winner) {
            System.out.println("Higher");
            return false;
        }
        else if (guess > winner) {
            System.out.println("Lower");
            return false;
        }
        else if (guess == winner) {
            System.out.println("Good guess!");
            return true;
        }
        else {
            System.out.println("Something went wrong...");
            return false;
        }
    }

}

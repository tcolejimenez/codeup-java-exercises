import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {
//        System.out.println("Running the arithmetic methods:");
//        System.out.println(add(2, 3));
//        System.out.println(subtract(2, 3));
//        System.out.println(multiply(2, 3));
//        System.out.println(divide(2, 3));
//        System.out.println(modulus(2, 3));
//        System.out.println(multiplyAdd(2, 3));
//        System.out.println(multiplyRec(2, 5));


        //System.out.print("Enter a number between 1 and 10: ");
        //Scanner scan = new Scanner(System.in);

        //int userInput = getInteger(1, 10);
        //System.out.println("You did it! Valid input: " + userInput);

//        findFactorial();

        playDice();

    }

    /*Basic Arithmetic
    *    Create four separate methods. Each will perform an arithmetic operation:
    *       Addition
    *       Subtraction
    *       Multiplication
    *       Division
    *
    * Each function needs to take two parameters/arguments so that the operation can be performed.
    * Test your functions and verify the output.
    * Add a modulus function that finds the modulus of two numbers.
    *
    * Bonus
    * Create your multiplication method without the * operator (Hint: a loop might be helpful).
    * Do the above with recursion.
    */


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static double multiplyAdd(double num1, double num2) {
        double sum = 0;
        for (int i = 0; i < num2; i++) sum += num1;
        return sum;
    }

    public static double multiplyRec(double num1, double num2) {
        if (num2 == 1) return num1;
        return num1 + (multiplyRec(num1, num2-1));
    }

    /*Create a method that validates that user input is in a certain range
    *
    * The method signature should look like this:
    * public static int getInteger(int min, int max);
    *
    * and is used like this:
    * System.out.print("Enter a number between 1 and 10: ");
    * int userInput = getInteger(1, 10);
    *
    * If the input is invalid, prompt the user again.
    *
    * Hint: recursion might be helpful here!
    * */

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();
        if (userInt < max && userInt > min) return userInt;
        else {
            System.out.println("Input invalid! Enter a number between 1 and 10:");
            return getInteger(min, max);
        }
    }

    /* Calculate the factorial of a number.
    * A factorial is a number multiplied by each of the numbers before it.
    *
    * Prompt the user to enter an integer from 1 to 10.
    * Display the factorial of the number entered by the user.
    * Ask if the user wants to continue.
    * Use a for loop to calculate the factorial.
    * Assume that the user will enter an integer, but verify it’s between 1 and 10.
    * Use the long type to store the factorial.
    * Continue only if the user agrees to.
    *
    * Factorials are denoted by the exclamation point (n!). Ex:
    * 1! = 1               = 1
    * 2! = 1 x 2           = 2
    * 3! = 1 x 2 x 3       = 6
    * 4! = 1 x 2 x 3 x 4   = 24
    *
    * Bonus
    * Test the application and find the integer for the highest factorial that can be accurately
    * calculated by this application, then modify the prompt so that it prompts the user for
    * a number "from 1 to {the highest integer that returns accurate factorial calculation}".
    * Don’t forget to change your verification too!
    *
    *Use Recursion to implement the factorial.
    * */

    public static void findFactorial() {
        //* Prompt the user to enter an integer from 1 to 10.
        //* Assume that the user will enter an integer, but verify it’s between 1 and 10.


        char cont = 'y';
        while (cont == 'y') {
            System.out.println("Let's play with factorials! Please enter a number between 1 & 10: ");
            int num = getInteger(1, 10);


            //* Display the factorial of the number entered by the user.
            //* Use a for loop to calculate the factorial.
            //* Use the long type to store the factorial.
            long factorial = num;
            for (int i = num-1; i > 0; i--) {
                factorial *= i;
            }

            System.out.format("The factorial of %d is %d. %n", num, factorial);

            //* Ask if the user wants to continue.
            //* Continue only if the user agrees to.
            System.out.println("Play again? y/n");
            Scanner scan = new Scanner(System.in);
            cont = scan.next().charAt(0);
        }
    }


    /* Create an application that simulates dice rolling.
    *
    * Ask the user to enter the number of sides for a pair of dice.
    * Prompt the user to roll the dice.
    * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    * Use static methods to implement the method(s) that generate the random numbers.
    * Use the .random method of the java.lang.Math class to generate random numbers.
    *
    * Bonus
    *
    * Keep track of how many guesses a user makes
    * Set an upper limit on the number of guesses
    * */


    public static void playDice () {
        String status;

        do {
            System.out.println("How many sides on your die?");
            Scanner scan = new Scanner(System.in);
            int sides = scan.nextInt();


            do {
                int[] roll = rollDice(sides);
                System.out.format("You got a %d! (%d + %d) %n", roll[0] + roll[1], roll[0], roll[1]);

                System.out.println("Roll again? Or try different dice? (Enter any other value to end)");
                status = scan.next();
            } while (status.equals("again"));
        } while (status.equals("different"));
    }

    public static int[] rollDice(int numSides) {
        int[] roll = new int[2];
        roll[0] = (int) Math.floor(Math.random() * numSides) + 1;
        roll[1] = (int) Math.floor(Math.random() * numSides) + 1;
        return roll;
    }





}

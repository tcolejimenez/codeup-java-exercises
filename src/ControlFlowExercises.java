import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        //Loop Basics

        /* While
         * Create an integer variable i with a value of 5.
         * Create a while loop that runs so long as i is less than or equal to 15
         * Each loop iteration, output the current value of i, then increment i by one.
         * Your output should look like this:
         * 5 6 7 8 9 10 11 12 13 14 15
         */

        System.out.println("Print 5 - 15 on one line");
        int i = 5;
        while (i <= 15) {
            System.out.print(i++ + " ");
        }
        System.out.print("\n");

        /* Do While
         * Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
         * Alter your loop to count backwards by 5's from 100 to -10.
         * Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
         * Output should equal:
         * 2
         * 4
         * 16
         * 256
         * 65536
         * */


        System.out.println("Add two while less than or equal to 100:");
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);
        System.out.print("\n");


        System.out.println("Subtract 5 while greater than or equal to -10:");
        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);
        System.out.print("\n");


        System.out.println("Square while under 1000000:");
        i = 2;
        do {
            System.out.println(i);
            i = (int) Math.pow(i, 2);
        } while (i < 1000000);
        System.out.print("\n");


        /* For loop
         * refactor the previous two exercises to use a for loop instead
         * */
        System.out.println("Using for loop, print 5-15:");
        for (int z = 5; z <= 15; z++) {
            System.out.print(z + " ");
        }
        System.out.print("\n\n");

        System.out.println("Using for loop, add two while less than or equal to 100:");
        for (int z = 0; z <= 100; z += 2) {
            System.out.println(z);
        }
        System.out.print("\n");

        System.out.println("Using for loop, subtract 5 while greater than or equal to -10:");
        for (int z = 100; z >= -10; z -= 5) {
            System.out.println(z);
        }
        System.out.print("\n");

        /* Fizzbuzz
         *  Write a program that prints the numbers from 1 to 100.
         *  For multiples of three print “Fizz” instead of the number
         *  For the multiples of five print “Buzz”.
         *  For numbers which are multiples of both three and five print “FizzBuzz”.
         */

        System.out.println("Fizzbuzz using for loop");
        for (int z = 1; z <= 100; z++) {
            if (z % 3 == 0 || z % 5 == 0) {
                if (z % 3 == 0) System.out.print("Fizz");
                if (z % 5 == 0) System.out.print("Buzz");
            } else {
                System.out.print(z);
            }
            System.out.print("\n");
        }
        System.out.print("\n");


        /* Display a table of powers.
        *  Prompt the user to enter an integer.
        *  Display a table of squares and cubes from 1 to the value entered.
        *  Ask if the user wants to continue.
        *  Assume that the user will enter valid data.
        *  Only continue if the user agrees to.
        *
        *  What number would you like to go up to? 5

        * Here is your table!

        number | squared | cubed
        ------ | ------- | -----
        1      | 1       | 1
        2      | 4       | 8
        3      | 9       | 27
        4      | 16      | 64
        5      | 25      | 125
        */

        //initializes char for loop
        //while continue as long as value will be y
        //prompts user for new value at end of table
        char cont = 'y';
        while (cont == 'y') {

            //get number to count up to
            System.out.println("Please enter an integer:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            //adds header for table
            System.out.println("number | squared | cubed \n------ | ------- | -----");

            //loops based to print for every value up to number entered
            for (int z = 1; z <= num; z++) {

                //calculates squared number and cubed
                int sqrd = z * z;
                int cubed = (int) Math.pow(z, 3);

                //calculate number of spaces needed based on length of number
                int numSpaces = 6 - String.valueOf(z).length();
                int sqrdSpaces = 7 - String.valueOf(sqrd).length();
                //int cubeSpaces = 7 - String.valueOf(cube).length();

                //adds number to output and required number of spaces
                String output = String.valueOf(z);
                for (int y = 0; y <= numSpaces; y++) output += " ";

                //adds squared number and required number of spaces
                output += String.valueOf("| " + sqrd);
                for (int y = 0; y <= sqrdSpaces; y++) output += " ";

                //simply adds cubed number as spaces aren't needed for formatting
                output += String.valueOf("| " + cubed);

                //print out formatted output
                System.out.println(output);
            }

            //ask user if they'd like to continue
            System.out.println("\nWould you like to try another number? (y/n)");
            String response = scanner.next();
            cont = response.charAt(0);
        }

        /* Convert given number grades into letter grades.
         *  Prompt the user for a numerical grade from 0 to 100.
         *  Display the corresponding letter grade.
         *  Prompt the user to continue.
         *  Assume that the user will enter valid integers for the grades.
         *  The application should only continue if the user agrees to.
         *  Grade Ranges: A : 100 - 88, B : 87 - 80, C : 79 - 67, D : 66 - 60, F : 59 - 0
         * */

        /*
        Scanner scanner = new Scanner(System.in);

        cont = 'y';
        while (cont == 'y') {
            System.out.println("\nWhat's your grade? Can enter from 0-100; please only use whole numbers.");
            int grade = scanner.nextInt();
            String gradeLetter;
            if (grade > 87) gradeLetter = "A";
            else if (grade > 79) gradeLetter = "B";
            else if (grade > 66) gradeLetter = "C";
            else if (grade > 59) gradeLetter = "D";
            else gradeLetter = "F";
            System.out.format("Your grade was %d so you got a %s.", grade, gradeLetter);

            if (grade < 67) System.out.print("(Bummer)");

            System.out.print("\n");

            //ask user if they'd like to continue
            System.out.println("\nWould you like to check another grade? (y/n)");
            String response = scanner.next();
            cont = response.charAt(0);
        } */



        /* Bonus
         *  Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
         */

        Scanner scanner = new Scanner(System.in);

        cont = 'y';
        while (cont == 'y') {
            System.out.println("\nWhat's your grade? Can enter from 0-100; please only use whole numbers.");
            int grade = scanner.nextInt();
            String gradeLetter;
            //a range
            if (grade > 96) gradeLetter = "A+";
            else if (grade > 93) gradeLetter = "A";
            else if (grade > 89) gradeLetter = "A-";

            //B range
            else if (grade > 86) gradeLetter = "B+";
            else if (grade > 83) gradeLetter = "B";
            else if (grade > 79) gradeLetter = "B-";

            //C range
            else if (grade > 76) gradeLetter = "C+";
            else if (grade > 73) gradeLetter = "C";
            else if (grade > 69) gradeLetter = "C-";

            //D range
            else if (grade > 66) gradeLetter = "D+";
            else if (grade > 63) gradeLetter = "D";
            else if (grade > 59) gradeLetter = "D-";


            //F (no range)
            else gradeLetter = "F";

            //print out grade for user
            System.out.format("Your grade was %d so you got a %s.", grade, gradeLetter);

            //adds additional sad message if bad score
            if (grade < 67) System.out.print(" (Bummer)");

            //separately add new line char
            System.out.print("\n");

            //ask user if they'd like to continue
            System.out.println("\nWould you like to check another grade? (y/n)");
            String response = scanner.next();
            cont = response.charAt(0);
        }

    }

}

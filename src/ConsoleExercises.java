import java.util.Scanner;

public class ConsoleExercises {

    //executing method
    public static void main(String[] args) {
        double pi = 3.14159;

        /*
        * Write some java code that uses the variable pi to output the following:
        * "The value of pi is approximately 3.14."
        * Don't change the value of the variable, instead,
        * reference one of the links above and use System.out.format to accomplish this.
        */

        System.out.format("The value of pi is approximately %.2f. %n", pi);

        /*
        * Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        * What happens if you input something that is not an integer?
        */

        String prompt = "Please enter an integer:";
        Scanner scanner = new Scanner(System.in);

        //System.out.println(prompt);
        //int userInput = scanner.nextInt();
        //System.out.println("You entered >>>>" + userInput +"<<<<<!");

        /*
        * Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
        * What happens if you enter less than 3 words?
        * What happens if you enter more than 3 words?
        */

        prompt = "Please enter 3 words:";
        System.out.println(prompt);
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.format("You entered: %n %s %n %s %n %s %n", word1, word2, word3);

        /*
        * Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
        * then display that sentence back to the user.
        * do you capture all of the words?
        */

//        prompt = "Please enter a sentence:";
//        System.out.println(prompt);
//        String sentence = scanner.next();
//
//        System.out.println("Looks like the sentence you entered was: \n" + sentence);

        /*
        Rewrite the above example using the .nextLine method.
        */

        prompt = "Please enter a sentence:";
        //System.out.println(prompt);
        //String sentence2 = scanner.nextLine();

        //System.out.println("Looks like the sentence you entered was: \n" + sentence2);

        /*
        * Calculate the perimeter and area of Codeup's classroom.
        * Prompt the user to enter values of length and width of a classroom at Codeup
        * Use the .nextLine method to get user input and cast the resulting string to a numeric type.
        * Assume that the rooms are perfect rectangles.
        * Assume that the user will enter valid numeric data for length and width.
        *
        * Display the area and perimeter of that classroom.
        * The area of a rectangle is equal to the length times the width,
        * and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        */


//        prompt = "Please enter the length and width separated with a space:";
//        System.out.println(prompt);
//        int length = Integer.parseInt(scanner.next());
//        int width = Integer.parseInt(scanner.next());
//
//        int perimeter = (length * 2) + (width * 2);
//        int area = length * width;
//
//        System.out.println("Based on the input, the area is: " + area + ". ");
//        System.out.println("Based on the input, the perimeter is: " + perimeter + ". ");


        /*
        * Bonuses
        * Accept decimal entries
        * Calculate the volume of the rooms in addition to the area and perimeter
        */

        char moreRooms = 'y';
        double totalVolume = 0;
        while (moreRooms =='y') {
            prompt = "Please enter the length and width, separated with a space: ";
            System.out.println(prompt);

            double length = scanner.nextDouble();
            double width = scanner.nextDouble();

            totalVolume += printArea(length, width);
            printPerimeter(length, width);

            prompt = "Are you any more rooms?";
            System.out.println(prompt);
            moreRooms = scanner.next().charAt(0);
        }

        System.out.println("The total volume of classroom(s) is "+ totalVolume + ". ");


    }

    public static double printArea(double length, double width) {
        double area = length * width;
        System.out.println("Based on the input, the area is: " + area + ". ");
        return area;
    }

    public static void printPerimeter(double length, double width) {
        double perimeter = length * 2 + width * 2;
        System.out.println("Based on the input, the perimeter is: " + perimeter + ". ");
    }
}

package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }


    public String getString() {
        return scanner.nextLine();
    }

    //with optional prompt
    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    //should keep prompting the user for input until they give an integer within the min and max
    public String getValidString(ArrayList<String> validInput, String prompt) {
        System.out.println(prompt);
        String userInput = getString(prompt);
        if (validInput.contains(userInput)) return userInput;
        else {
            System.out.println("Input invalid!");
            return getValidString(validInput, prompt);
        }
    }

    //should keep prompting the user for input until they give an integer within the min and max
    public static String getValidString(ArrayList<String> validInput, String prompt, String errorPrompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
            if (validInput.contains(userInput)) return userInput;
            else {
                System.out.println(errorPrompt);
                return getValidString(validInput, prompt, errorPrompt);
            }
        }


    // return true if the user enters y, yes, or variants thereof, and false otherwise
    public static boolean yesNo() {
        String input = scanner.nextLine();
        if (input.charAt(0) == 'y') {
            return true;
        } else
            return false;
    }

    // return true if the user enters y, yes, or variants thereof, and false otherwise
    //with optional prompt
    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        if (input.charAt(0) == 'y') {
            return true;
        } else
            return false;
    }

    //should keep prompting the user for input until they give an integer within the min and max
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < max && userInt > min) return userInt;
        else {
            System.out.println("Input invalid!");
            return getInt(min, max);
        }
    }

    //should keep prompting the user for input until they give an integer within the min and max
    //with optional prompt
    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userInt = getInt();
        if (userInt < max && userInt > min) return userInt;
        else {
            System.out.println("Input invalid!");
            return getInt(min, max);
        }
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();

        return userInt;
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();
        return userInt;
    }

    //should do the same thing, but with decimal numbers
    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < max && userDouble > min) return userDouble;
        else {
            System.out.println("Input invalid!");
            return getDouble(min, max);
        }
    }

    //should do the same thing, but with decimal numbers
    //with optional prompt
    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userDouble = getDouble();
        if (userDouble < max && userDouble > min) return userDouble;
        else {
            System.out.println("Input invalid!");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        Scanner scan = new Scanner(System.in);
        double userDouble = scan.nextDouble();
        return userDouble;
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        double userDouble = scan.nextDouble();
        return userDouble;
    }


}

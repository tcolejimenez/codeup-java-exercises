package util;

import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input tester = new Input();

        System.out.println("Please enter a string");
        String input = tester.getString();
        System.out.println(input);

        System.out.println("Yes or no my friend?");
        boolean yesOrNah = tester.yesNo();
        System.out.println(yesOrNah);

    }
}

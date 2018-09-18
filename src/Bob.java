import java.util.Scanner;

public class Bob {
    //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
    //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's talk to Bob! (enter end to exit)");

        String input = "";
        while (!input.equals("end")) {
            System.out.print("You: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (!input.equals("end")) {
                //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
                if (input.isEmpty()) System.out.println("Bob: Fine. Be that way!");

                    //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
                else if (input.trim().charAt(input.trim().length() - 1) == '!') System.out.println("Bob: Whoa, chill out!");

                    //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
                else if (input.trim().charAt(input.trim().length() - 1) == '?') System.out.println("Bob: Sure.");

                    //He answers 'Whatever.' to anything else.
                else System.out.println("Bob: Whatever.");

            }
        }

    }
}

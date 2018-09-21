public class ServerNameGenerator {

    //Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    static String[] nouns = {"spaceship", "banana", "flower", "eyeball", "cutie", "deck", "sneaks", "chain", "comic", "teacup"};
    static String[] adjectives = {"rad", "tubular", "awesome", "groovy", "tight", "cool", "BA", "smooth", "cute", "fly"};



    //Create a method that will return a random element from an array of strings.
    public static String randomString(String[] strings) {
        return strings[(int) Math.floor(Math.random() * strings.length)];
    }

    public static String generateServerName() {
        String serverName = randomString(adjectives) + "-" + randomString(nouns);
        return serverName;
    }


    //Add a main method, and inside of your main method select and random noun and adjective
    // and hyphenate the combination and display the generated name to the user.

    //Example output---
    //Here is your server name:
    //dedicated-photon

    public static void main (String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(generateServerName());
        }
    }


}

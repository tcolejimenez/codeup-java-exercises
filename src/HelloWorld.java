public class HelloWorld {
    public static void main (String[] args) {
//        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.println("World!");

        //Create an int variable named myFavoriteNumber and assign your favorite number to it,
        // then print it out to the console.
        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);


        //Create a String variable named myString and assign a string value to it,
        // then print the variable out to the console.
        String myString = "songs are nice.";
        System.out.println(myString);

        //Change your code to assign a character value to myString. What do you notice?
        //myString = 'c';

        //Change your code to assign the value 3.14159 to myString. What happens?
        //myString = 3.13159;


        //Declare an long variable named myNumber, but do not assign anything to it.
        // Next try to print out myNumber to the console. What happens?
        //long myNumber;
        //System.out.println(myNumber);

        //Change your code to assign the value 3.14 to myNumber. What do you notice?
        //myNumber = 3.14;

        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        //myNumber = 123L;
        //System.out.println(myNumber);

        //Change your code to assign the value 123 to myNumber.
        //myNumber = 123;
        //System.out.println(myNumber);

        //Why does assigning the value 3.14 to a variable declared as a long not compile,
        // but assigning an integer value does?

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it.
        // What happens? What are two ways we could fix this?
        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        myNumber = 3.14f;
        System.out.println(myNumber);

        double mydoubleNumber = 3d;
        System.out.println(mydoubleNumber);

        ///Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);

        //What is the difference between the above code blocks? Explain why the code outputs what it does.

        //Try to create a variable named class. What happens?
        //int class = 4;
        //System.out.println(class);

        //Rewrite the following expressions using the relevant shorthand assignment operators:
        //
        // int x = 4;
        // x = x + 5;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

        // int x = 3;
        // int y = 4;
        // y = y * x;

//         int x = 3;
//         int y = 4;
//         y *= x;
//        System.out.println(y);


        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;

        int x = 10;
        int y = 2;
         x /= y;
         System.out.println(x);
         y -= x;
        System.out.println(y);

    }
}

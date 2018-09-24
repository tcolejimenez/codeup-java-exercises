package movies;

import util.Input;

public class MoviesApplication {
    static Input inputter = new Input();

    public static void main(String[] args) {

        //Give the user a list of options for viewing all the movies or viewing movies by category.
        //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
        //If a category is selected, only movies from that category should be displayed.
        //Your application should continue to run until the user chooses to exit.

        Movie[] movies = MoviesArray.findAll();
        int userInput;

        System.out.println("Welcome to the movie application!");
        do {
            System.out.println("\nWhat would you like to do?");

            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie");

            System.out.print("\nEnter your choice: ");
            userInput = inputter.getInt();
            movies = displayMovies(userInput, movies);
        } while (userInput != 0);


    }


    public static Movie[] displayMovies(int categoryNum, Movie[] movies) {
        String category = "";
        System.out.println("\n");

        switch (categoryNum) {
            case 1:
                System.out.println("Displaying all movies:");
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                return movies;
            case 2:
                category = "animated";
                break;
            case 3:
                category = "drama";
                break;
            case 4:
                category = "horror";
                break;
            case 5:
                category = "scifi";
                break;
            case 6:
                movies = addNewMovie(movies);
                return movies;
        }

        if (categoryNum != 0 ) {
        System.out.println("Displaying " + category + " movies: ");
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category))
                System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
        }
        return movies;

    }

    public static Movie[] addNewMovie(Movie[] oldArray) {
        System.out.println("Let's add a new movie!");

        //create new array with updated length
        //old length + 1
        Movie[] newArray = new Movie[oldArray.length + 1];

        //fill new array with values from old array
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        //add last element (new person)
        newArray[oldArray.length] = new Movie(inputter.getString("Name of movie: "), inputter.getString("Category of movie: "));

        return newArray;
    }
}


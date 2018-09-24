package movies;

public class Movie {

    //private fields for name and category, and a constructor that sets both of these.
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Movie(String name) {
        this.name = name;
        this.category = "unknown";
    }
    public Movie() {
        this.name = "unknown";
        this.category = "unknown";
    }


    //Create methods to access these properties and change them (getters and setters).
    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}

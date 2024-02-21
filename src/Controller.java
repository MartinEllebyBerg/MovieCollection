public class Controller {

    // Attribute
    MovieCollection collection;

    // Constructor
    public Controller() {
        collection = new MovieCollection();
    }

    // Method
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.addMovie(new Movie(title, director, year, isInColor, lengthInMinutes, genre));
    }
}

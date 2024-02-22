import java.util.ArrayList;

public class MovieCollection {

    // Attributes
    private final ArrayList<Movie> collection;

    // Constructor
    public MovieCollection() {
        collection = new ArrayList<Movie>();
    }

    // Method
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.add(new Movie(title, director, year, isInColor, lengthInMinutes, genre));
    }

    public MovieCollection searchMovie(String searchTitle) {
        MovieCollection mc = new MovieCollection();
        for(Movie movie : this.collection) {
            if(movie.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                mc.collection.add(movie);
            }
        }
        if(mc.collection.isEmpty()) {
            return null;
        } else {
            return mc;
        }
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for(Movie movie : collection) {
            returnString.append("\n").append(movie).append("\n");}
        return "" + returnString;
    }
}
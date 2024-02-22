import java.util.Objects;

public class Controller {

    // Attribute
   MovieCollection collection;

    // Constructor
    public Controller() {
        collection = new MovieCollection();
    }

    // Method
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.addMovie(title, director, year, isInColor, lengthInMinutes, genre);
    }

    public String searchMovie(String searchTitle) {
        MovieCollection movie = collection.searchMovie(searchTitle);
        if (Objects.isNull(movie)) {
            return "No match for " + searchTitle + ".";
        } else {
            return "---Movies containing " + searchTitle + " in title---" + movie + "\n---search results ends---";
        }
    }
    public String getMovieCollectionAsString() {
    return "---MovieCollection begins---\n" + collection + "\n---MovieCollection ends---";
    }
}

import java.util.ArrayList;

public class MovieCollection {

    // Attributes - Har lavet en arrayliste der bliver ved med at udvide sig når vi tilføjer film til (den er dynamisk)
    private final ArrayList collection;

    // Constructor
    public MovieCollection() {
        collection = new ArrayList();
    }

    // Methods
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.add(new Movie(title, director, year, isInColor, lengthInMinutes, genre));
    }
}
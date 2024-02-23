import java.util.ArrayList;

public class MovieCollection {
    //MovieCollection repræsenterer samlingsdelen af vores MovieCollection opgave

    // ATTRIBUTTET 'collection' er en ArrayList af 'Movie' objekter, som skal indeholde alle filmene i samlingen.
    private final ArrayList<Movie> collection;

    // KONSTRUKTØREN her initialiserer 'collection' ved at oprette en ny instans af 'ArrayList<Movie>'.
    // Når man opretter et objekt (her collection) af denne klasse (her en filmliste, opretter jeg en instans af det blueprint/skabelon som MovieCollection repræsenterer.
    public MovieCollection() {
        collection = new ArrayList<Movie>();
    }

    // METODE: Metoden her tilføjer en film til samlingen ved at oprette en ny instans af 'ArrayList<Movie>' og tilføjer til 'collection'
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.add(new Movie(title, director, year, isInColor, lengthInMinutes, genre));
    }

    // METODE: Metoden 'searchMovie' søger efter en film baseret på en søgetitel (String searchTitle).
    // Her opretter den en ny MovieCollection (her mc) til at holde de fundne film. Den gennemgår den aktuelle samling med this.collection,
    // og tjekker om filmens titel indeholder et søgeord. Hvis en film matcher, tilføjes den til nye MovieCollection (mc), og returnerer mc.
    // Hvis søgeordet ikke findes, returnerer den 'null'.
    public MovieCollection searchMovie(String searchTitle) {
        MovieCollection mc = new MovieCollection();
        for (Movie movie : this.collection) {
            if (movie.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                mc.collection.add(movie);
            }
        }
        if (mc.collection.isEmpty()) {
            return null;
        } else {
            return mc;
        }
    }

    @Override
    // METODE: ToString metoden giver mig en strengpræsentation af 'MovieCollection', altså alle filmene i samlingen.
    public String toString() {
        String allFilms = "";
        // For-loopet siger, at for hver eneste filmobjekt i Collection, og for hver af dem vil jeg gerne tilføje til min filmsamling
        for (Movie movie : collection) {
            allFilms += movie.toString() + "\n";
        }
        return allFilms;
    }
}
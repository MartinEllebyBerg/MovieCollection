import java.util.Objects;

// Klasssen kontroller fungerer som en Controller til min filmsamling.
// Den fungerer som en mellemmand mellem brugeren og 'MovieCollection'-objektet
public class Controller {

    // ATTRIBUTTEN er collection som er et objekt af MovieCollection. 'collection' vil herefter indeholde de film vi tilføjer.
   MovieCollection collection;

    // KONSTRUKTØREN initialiserer 'collection' som er et objekt af MovieCollection ved at oprette en ny instans af MovieCollection.
    // Dette sikrer at hver controllerobjekt har en ny samling af film
    public Controller() {
        collection = new MovieCollection();
    }

    // METODE: addMovie tillader at tilføje en ny film til samlingen ved at kalde addMovie på 'collection'-objektet med de angivne attributer
    public void addMovie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        collection.addMovie(title, director, year, isInColor, lengthInMinutes, genre);
    }

    // METODE: searchMovie tillader at søge efter en film i samlingen ved at kalde på searchMovie()-metoden på 'collection'-objektet
    // med den angivne søgetitel (String searchTitle).
    public String searchMovie(String searchTitle) {
        MovieCollection movie = collection.searchMovie(searchTitle);
        if (Objects.isNull(movie)) {
            return "No match for " + searchTitle + ".";
        } else {
            return "---Movies containing " + searchTitle + " in title---\n" + movie + "\n---search results ends---";
        }
    }

    // METODE: Denne metode returnerer en strengrepræsentation ved at kalde toString metoden på 'collection'-objektet
    public String getMovieCollectionAsString() {
    return "---MovieCollection begins---\n" + collection + "\n---MovieCollection ends---";
    }
}

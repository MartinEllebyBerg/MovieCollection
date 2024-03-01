import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addMovie() {
        // Triple A Pattern
        //Arrange
        MovieCollection collection = new MovieCollection();

        //Act
        collection.addMovie("The Postman", "Kevin Costner", 1997, true, 177, "Action");

        //Assert
        int expectedSize = 1;
        int actualSize = collection.getMovieCollection().size();
        assertEquals(expectedSize, actualSize);
    }

    Void getMovieCollectionList() {
        // Triple A Pattern
        //Arrange
        MovieCollection collection = new MovieCollection();

        //Act
        collection.addMovie("The Postman", "Kevin Costner", 1997, true, 177, "Action");

        //Assert
    int expectedSize = 1;
    int actualSize = collection.collection().size();
        assertEquals(expectedSize, actualSize);
    }
}


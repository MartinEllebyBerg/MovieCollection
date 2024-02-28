import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addMovie() {
        // Triple A Pattern

        //Arrange
MovieCollection collection = new MovieCollection();
collection.addMovie("The Postman", "Kevin Costner", 1997, true, 177, "Action");

        //Act

        //Assert
    }

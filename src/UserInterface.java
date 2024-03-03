import java.util.InputMismatchException;
import java.util.Scanner;

//I denne klasse kører vi alt der tidligere lå i vores Main i metoden startProgram for at gøre det nemmere for forbrugeren
public class UserInterface {

    // Attribtus
    private Controller controller;
    private Scanner input;
    private boolean running;


    // Konstruktør
    public UserInterface() {
        input = new Scanner(System.in);
        controller = new Controller();

        //Hardkode til hurtig brugertest af tilføjet film
        controller.addMovie("Avatar", "James Cameron", 2009, true, 162, "Action");
        controller.addMovie("Avatar: The Way of Water", "James Cameron", 2022, true, 192, "Action");
        controller.addMovie("Love Actually", "Richard Curtis", 2003, true, 135, "Comedy");
        controller.addMovie("Harry Potter and the Prisoner of Azkaban", "Alfonso Cuarón", 2004, true, 142, "Adventure");
    }

    public void startProgram() {
        running = true;
        System.out.println("Welcome to my Moviecollection!");
        while (running) {
            int userChoice = printWelcome();
            if (userChoice == 1) {
                // Her kalder jeg en metoden makeMovie i stedet for at havde skrevet hele koden i formlen
                makeMovie();
            } else if (userChoice == 2) {
                printMovieCollection();
            } else if (userChoice == 3) {
                searchATitle();
            } else if (userChoice == 4) {
                disconnectProgram();
                break; //break afslutter while-loopet
            } else {
                System.out.println("Error: Choose 1, 2, 3 or 4\n");
            }
        }
    }

    public int printWelcome() {
        System.out.println("Choose a number:");
        System.out.println("1. Add a movie");
        System.out.println("2. View entire moviecollection");
        System.out.println("3. Search after a movietitle");
        System.out.println("4. Disconnect");
        int userChoice = input.nextInt();
        return userChoice;
    }

    public void makeMovie() {
        System.out.print("Type in title:");
        input.nextLine();
        String title = input.nextLine();

        System.out.print("Type in director:");
        String director = input.nextLine();

        System.out.print("Type in year:");
        int year = scanIntSafelyYear();

        System.out.print("Is it in color? (yes or no)");
        String color = input.next();
        boolean isInColor = color.equals("yes");

        System.out.print("Type in length in minutes:");
        int lengthInMinutes = scanIntSafelyLengthInMinutes();

        System.out.print("Type in genre:");
        input.nextLine();
        String genre = input.nextLine();

        controller.addMovie(title, director, year, isInColor, lengthInMinutes, genre);
        System.out.println("The movie '" + title + "' is added to your collection\n");
    }

    public void printMovieCollection() {
        System.out.println("Here is your moviecollection:");
        System.out.println(controller.collection);
    }

    public void searchATitle() {
        System.out.println("Write in a searchword for the movietitle:");
        System.out.println("\n" + controller.searchMovie(input.next()));
    }

    public void disconnectProgram() {
        System.out.println("Disconnected");
    }

    private int scanIntSafelyYear() { //Metode til at fange hvis man skriver et bogstav i en int scanner, der ellers vil melde en fejl
        try {
            return input.nextInt(); // Her tester den om der bliver tastet en int ind i scanneren
        } catch (InputMismatchException ime) {
            input.nextLine(); // Scanneren skal lige forstå, at den nu skal være klar til at læse på en ny linje
            System.out.println("Indtastede var ikke et tal - prøv igen herunder:");
            return scanIntSafelyYear(); // Rekursion: Metoden kalder sig selv, og starter dermed forfra med et nyt try!
        }
    }

    private int scanIntSafelyLengthInMinutes() { // Se forklaring på int-metode over
        try {
            return input.nextInt();
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Indtastede var ikke et tal - prøv igen herunder:");
            return scanIntSafelyLengthInMinutes();
        }
    }
}

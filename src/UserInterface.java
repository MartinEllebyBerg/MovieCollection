import java.util.Scanner;

//I denne klasse kører vi alt der tidligere lå i vores Main i metoden startProgram for at gøre det nemmere for forbrugeren
public class UserInterface {
    // Scanner input
    Scanner input = new Scanner(System.in);
    Controller controller = new Controller();


    public void startProgram() {
        while (true) {
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
    public int printWelcome(){
        System.out.println("Welcome to my Moviecollection!");
        System.out.println("Choose a number:");
        System.out.println("1. Add a movie");
        System.out.println("2. View entire moviecollection");
        System.out.println("3. Search after a movietitle");
        System.out.println("4. Disconnect");
        int userChoice = input.nextInt();
            return userChoice;
    }
    public void makeMovie(){
        System.out.print("Type in title:");
        input.nextLine();
        String title = input.nextLine();

        System.out.print("Type in director:");
        String director = input.nextLine();

        System.out.print("Type in year:");
        int year = input.nextInt();

        System.out.print("Is it in color? (yes or no)");
        String color = input.next();
        boolean isInColor = color.equals("yes");

        System.out.print("Type in length in minutes:");
        int lengthInMinutes = input.nextInt();

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
    public void searchATitle(){
        System.out.println("Write in a searchword for the movietitle:");
        System.out.println("\n" + controller.searchMovie(input.next()));
       }
    public void disconnectProgram(){
        System.out.println("Disconnected");
       }
}

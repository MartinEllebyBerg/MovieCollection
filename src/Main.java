import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner input
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();

        int userChoice;
        boolean run = true;

        while (run) {
            System.out.println("Welcome to my Moviecollection\nChoose a number:");
            System.out.println("1. Add a movie");
            System.out.println("2. View entire moviecollection");
            System.out.println("3. Search after a movietitle");
            System.out.println("4. Disconnect");
            userChoice = input.nextInt();

            if (userChoice == 1) {
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

            } else if (userChoice == 2) {
                System.out.println("Here is your moviecollection:");
                System.out.println(controller.collection);
            }
            else if (userChoice ==3) {
                System.out.println("Write in a searchword for the movietitle:");
                System.out.println("\n" + controller.searchMovie(input.next()));
            }
            else if (userChoice == 4) {
                System.out.println("Disconnected");
                break; //break afslutter while-loopet
            } else {
                System.out.println("Error: Choose 1, 2, 3 or 4\n");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner input
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();

        int userChoice = 0;

        //WHILE LOOP - programmet vil altid outputte nedenstående tekst
        // Er userchoice == 1 vil den begynde if-statement
        // Er userchoice == 2 vil den afslutte programmet
        // Er userchoice er alt vil den skrive fejltekst og loope forfra
        while (true) {
            System.out.println("Welcome to my Moviecollection\nChoose 1 or 2:");
            System.out.println("1. Add a movie");
            System.out.println("2. Disconnect");
            userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Type in title:");
                String title = input.next();

                System.out.println("Type in director:");
                String director = input.next();

                System.out.println("Type in year:");
                int year = input.nextInt();

                System.out.println("Is it in color? (yes or no)");
                String color = input.next();
                boolean isInColor = color.equals("yes");

                System.out.println("Type in length in minutes:");
                int lengthInMinutes = input.nextInt();

                System.out.println("Type in genre:");
                String genre = input.next();
                controller.addMovie(title, director, year, isInColor, lengthInMinutes, genre);
                System.out.println("Movie added");
                System.out.println("");
            } else if (userChoice == 2) {
                System.out.println("Disconnected");
                break; //break afslutter outputtet
            } else {
                System.out.println("Error: Choose 1 or 2");
                System.out.println("");
            }
        }
    }
}
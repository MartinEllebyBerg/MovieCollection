import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner input
        Scanner input = new Scanner(System.in);

       // Creating an array
        MovieCollection mc = new MovieCollection();

        int sentinel = 2;
        int userChoice = 0;

        while (userChoice != sentinel) {
            System.out.println("Welcome to my Moviecollection");
            System.out.println("1. Create a movie");
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
                System.out.println("");

                System.out.println("Type in length in minutes:");
                int lengthInMinutes = input.nextInt();

                System.out.println("Type in genre:");
                String genre = input.next();
                //NOGET JEG IKKE KAN HUSKE..

                // Placing the two answers in the array
                mc.addMovie(title, director, year, isInColor, lengthInMinutes, genre);
            }
        }

    }
}
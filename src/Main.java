import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // creating an array
        MovieCollection mc = new MovieCollection(5);

        // scanner input
        Scanner input = new Scanner(System.in);

        System.out.println("Type in title:");
        String title = input.nextLine();

        System.out.println("Type in director:");
        String director = input.nextLine();

       // placing our two answers in the array
        mc.addMovie(title, director);
    }
}
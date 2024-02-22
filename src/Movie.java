public class Movie {

    // Attributes
    private String title;
    private String director;
    private int year;
    private boolean isInColor;
    private double lengthInMinutes;
    private String genre;

    // Constructor
    public Movie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Title: " + title + "\n" + "Director: " + director + "\n" + "Year: " + year + "\n" + "Genre: " + genre + "\n" + "Runtime: " + lengthInMinutes + "\n";
        if (isInColor == true) {
            result += "Color: In color\n";
        } else {
            result += "Color: Black and White\n";
        }

        return result;

    }
}

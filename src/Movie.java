public class Movie {
// Klassen Movie repræsenter film-delen af vores MovieCollection

    // ATTRIBUTTER
    private String title;
    private String director;
    private int year;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    // KONSTRUKTØR tager attributerne som argumenter og initialiserer objektet med dem
    public Movie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    // GETTER giver adgang til værdigerne af attributterne
    public String getTitle() {return title;}
    /* Vi bruger ikke disse getter metoder
    public String getDirector() {return director;}
    public int getYear() {return year;}
    public boolean getIsInColor() {return isInColor;}
    public int getLengthInMinutes() {return lengthInMinutes;}
    public String getGenre() {return genre;}
    */

    @Override
    // METODE: toString findes i alle objekter, da den er arvet fra klassen 'Objekt' og konverterer objektets tilstand til en streng.
    // toString returner en String repræsentation af et objekt. Bruger vi ikke toString, printer programmet volapyk ud.
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

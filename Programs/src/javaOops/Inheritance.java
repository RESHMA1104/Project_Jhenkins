package javaOops;
import java.util.*;
import java.text.*;
// Interface 1
interface SearchbyGenre {
    void searchbyGenre(String genre);
}
// Interface 2
interface SearchbyTitle {
    void searchbyTitle(String title);
}
// Movie Class
class Movie {
    private String title;
    private String genre;
    private int rating;
    private String language;
    private Date releaseDate;
    private String country;
    private String category;
    public Movie(String title, String genre, int rating, String language, Date releaseDate, String country, String category) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public void getMovieDetail() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Country: " + country);
        System.out.println("----------------------");
    }
}
// Catalog Class
class Catalog implements SearchbyTitle, SearchbyGenre {

    private static Date lastUpdated;
    private static List<Movie> MovieList = new ArrayList<>();

    @Override
    public void searchbyTitle(String title) {
        for (Movie movie : MovieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchbyGenre(String genre) {
        for (Movie movie : MovieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                movie.getMovieDetail();
            }
        }
    }
    public static void main(String[] args) {
        Catalog c = new Catalog();
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = cal.getTime();
        lastUpdated = date;
        Movie m1 = new Movie("Akira", "Drama", 3, "English", date, "France", "Action");
        Movie m2 = new Movie("Titanic", "Romance", 5, "English", date, "USA", "Drama");
        MovieList.add(m1);
        MovieList.add(m2);
        System.out.println("Search by Title:");
        c.searchbyTitle("Titanic");
        System.out.println("Search by Genre:");
        c.searchbyGenre("Drama");
    }
}
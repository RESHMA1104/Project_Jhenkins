package javaOops;
public interface SearchbyGenre{
	public abstract void searchbyGenre(String genre);
}
public interface SearchbyTitle{
	public abstract void searchbyTitle(String title);
}
public class Catalog implements SearchbyTitle, SearchbyGenre{
	private static Date lastUpdated;
}
private static List<Movie> MovieList= new ArrayList<Movie>();
@Override
public void searchbyTitle(String title) {
	for (Movie movie:MovieList) {
		if(movie.getTitle().equals(title)) {
			movie.getMovieDetail();
		}
	}
}
@Override
public void searchbyGenre(String genre) {
	for (Movie movie:MovieList) {
		if(movie.getGenre().equalsIgnoreCase(genre)) {
			movie.getMovieDetail()]}
}
}
public static void main(String[] arg) {
	Catalog C = new Catalog();
}
Calendar cal= Calendar.getInstance();
DateFormatdateFormat= new SimpleDateFormat("MM/dd/yyyy");
Date date= cal.getTime();
String todaysdate= dateFormat.format(date);
Movie M1 = new Movie("AkiAA","Drama",3,"English",date,"France","Action");  
MovieList.add(M1);

public class Inheritance {

}

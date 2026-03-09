package JavaCore;
public class functionExample {
		static void movieDetails(String moviename, String movieDescription, String movieduration, String movielanguage, String moviereleasedate, String moviecountry, String moviegenre) {
			System.out.println("MOVIE DETAILS");
			System.out.println("Movie Name : "+moviename);
			System.out.println("Movie Description : "+movieDescription);
			System.out.println("Movie Duration : "+movieduration);
			System.out.println("Movie Language : "+movielanguage);
			System.out.println("Movie Release Date : "+moviereleasedate);
			System.out.println("Movie Country : "+moviecountry);
			System.out.println("Movie Genre : "+moviegenre);
		}
		public static void main(String[] args) {
			String moviename = "Beast";
			String movieDescription = "Beast is a Action Flim";
			String movieduration = "2 h 30 m";
			String movielanguage = "Tamil";
			String moviereleasedate = "02.10.2024";
			String moviecountry = "India";
			String moviegenre = "Action";
			movieDetails(moviename, movieDescription, movieduration, movielanguage, moviereleasedate, moviecountry, moviegenre);
	}
}
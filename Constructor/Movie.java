package Constructor;

public class Movie {
	String movieName;
	String actorName;
	String actressName;
	String director;
	int viewersRating;

	public Movie(String movieName, String actorName, String actressName, String director, int viewersRating) {

		this.movieName = movieName;
		this.actorName = actorName;
		this.actressName = actressName;
		this.director = director;
		this.viewersRating = viewersRating;
	}

	public void moviereview() {

		System.out.println("_________MOVIE REVIEW__________________");
		System.out.println("Name of the Movie:" + movieName);
		System.out.println("Actor of the Movie:" + actorName);
		System.out.println("Actress of the Movie:" + actressName);
		System.out.println("Director of the Movie:" + director);
		System.out.println("Rating of the Movie:" + viewersRating);
	}

	public static void main(String[] args) {

		Movie BehindwoodsRating = new Movie("CHARLIE", "DULQUER SALMAN", "PARVATHY", "MARTIN", 3);
		BehindwoodsRating.moviereview();
		
		Movie BehindwoodsRating2 = new Movie("beast", "Vijay", "Pooja", "Nelson", 3);
		BehindwoodsRating2.moviereview();
	}

}
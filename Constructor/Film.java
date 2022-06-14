package Constructor;

public class Film {

	public Film(String actorName, String ActressName, String Director) {

		System.out.println("the hero name:" +" "+ actorName);
		System.out.println("the movie is a name:" +" "+ ActressName);
		System.out.println("the actress is a name:" +" "+ Director);
	}

	public Film(int Review) {

		System.out.println("the review is:"+" " + Review);
	}

	public static void main(String[] args) {
		
		Film MovieDetails = new Film("Chhihhchore", "Suhant singh rajput", "Shardha kappor");
		Film Rating = new Film(4);
	}

}

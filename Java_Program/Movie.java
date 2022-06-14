package Java_Program;

 class Movie1 {

	String movie,actorName,actressname,director;
	int rating;
	
   void details(String movie,String actorName,String actressname,String director) {
	   
        System.out.println("The movie name is"+movie);
        System.out.println("The movie name is"+actorName);
        System.out.println("The movie name is"+actressname);
        System.out.println("The movie name is"+director);
        System.out.println("The movie name is"+rating);
	}
   
 }
  public class Movie{	
	public static void main(String[] args) {
		
		Movie1 review=new Movie1();
		review.details("Charlie","par","martin","Dq");
				
	}

}

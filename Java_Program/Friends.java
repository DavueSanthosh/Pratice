package Java_Program;


  class College{
	
	    String san,rakesh,elamaran,agekar;
	    int cgp;
	 
  public void frd(String san,String rakesh,String elamaran,String agekar,int cgp) {
	  
          System.out.println("the unique person in college"+san);
          System.out.println("the bad person in college"+elamaran);
          System.out.println("the kadha person in college"+rakesh);
          System.out.println("the playboy person in college"+agekar);
          System.out.println("the mark"+cgp);
	}
 }
  
public class Friends {

	public static void main(String[] args) {
		College Friends=new College();
		Friends.frd("santhosh","food","girls","pavith", 6);
	}

}

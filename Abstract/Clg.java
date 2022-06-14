package Abstract;

  abstract class School{
	  
	abstract void clgname();
	abstract void course();
	
 }

 public class Clg extends School{

	@Override
	void clgname() {
		System.out.println("Anna University");
	}
		
	

	@Override
	void course() {
		System.out.println("ICE");
		
	}
	public static void main(String[] args) {
		Clg clgDetails=new Clg();
		clgDetails.clgname();
		clgDetails.course();
	}
	}
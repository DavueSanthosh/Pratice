package Training;

 class Digit {
	String name;

	public Digit() {
		
		//super();
		System.out.println("Food");

	}

	public void eat() {
		System.out.println("Burger");

	}

}	
	
	class Final extends Digit {
		
		public Final() {
			super();
			System.out.println("Veg");
		}
		
		
		 public void drink() {
			 System.out.println("Mojito");

		}

	}
   
	public class FinalKeyword{
		
	
	public static void main(String[] args) {
		
//		FinalKeyword green = new FinalKeyword();
//		green.eat();
		
		Final obj=new Final();
		obj.drink();
		
	}
	}


package Training;

public class Food {
	String name;
	String Split;
	String remainingLetters;
	String Total;

	public Food(String name) {
		this.name = name;

	}

	public void Burger() {
		
	    String split = name.substring(0, 1);
	    String remainingLetters = name.substring(1);
	    Total=split.toUpperCase()+remainingLetters;
		System.out.println(Total);

	}
  public static void main(String[] args) {
	  Food eat=new Food("santhosh");
	  eat.Burger();
   }
}
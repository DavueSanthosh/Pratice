package Constructor;

public class Colorthis {
	String name, letter;
	int Height;

	public Colorthis(String name,  String letter,int Height) {
		this.name=name;
		this.letter=letter;
		this.Height=Height;
	}
	
	public void personDetails() {
		
		System.out.println("good name:"+name);
		System.out.println("good letter:"+letter);
		System.out.println("good height:"+Height);
		
	}

	public static void main(String[] args) {
		Colorthis nameOfThePeron=new Colorthis("Santhosh", "Department of ICE",5);
		nameOfThePeron.personDetails();
	}

}

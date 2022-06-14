package Constructor;

public class AnimalConstructor {
	
	public AnimalConstructor(String captain) {
		
		System.out.println("Name:" + captain);
	}

	public AnimalConstructor(int captainHeight) {
		
		System.out.println("Height" + captainHeight);
	}

	public static void main(String[] args) {
		
		AnimalConstructor Cricket = new AnimalConstructor("Dhoni");
		AnimalConstructor ipl = new AnimalConstructor(2);
	}

}

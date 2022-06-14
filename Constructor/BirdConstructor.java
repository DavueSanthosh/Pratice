package Constructor;

public class BirdConstructor {
	
	public BirdConstructor(String name) {
		
		System.out.println("Name:" + " "+name);

	}

	public BirdConstructor(int num) {
		
		System.out.println("Bird No:" + " "+num);
	}

	public BirdConstructor(String color, int Height) {
		
		System.out.println("Speed:" + " "+color);
		System.out.println("Height:" +" "+ Height);
	}

	public static void main(String[] args) {
		
		BirdConstructor sky = new BirdConstructor("Sparrow");
		BirdConstructor nest = new BirdConstructor(200);
		BirdConstructor bird = new BirdConstructor("White", 3);
	}

}

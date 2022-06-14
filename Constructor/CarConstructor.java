package Constructor;

public class CarConstructor 
{
	
	public CarConstructor(String Car) {
		System.out.println("Car name:" + Car);
	}

	public CarConstructor(int number) {
		System.out.println("model no" + number);
	}

	public static void main(String[] args) {
		
		CarConstructor F1 = new CarConstructor("Rollce royce");
		CarConstructor F2 = new CarConstructor(210);
	}

}

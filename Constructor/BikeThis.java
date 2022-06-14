package Constructor;

 public class BikeThis {
	String name;
	int number;
	float height;

	public BikeThis(String name, int number, float height) {
		this.name = name;
		this.number = number;
		this.height = height;
	}
	
	public void twoWheelers() {
	   	System.out.println("Bike name:" + name);
		System.out.println("Bike num:" + number);
		System.out.println("Bike height:" + height);
	}

	public static void main(String[] args) {
		BikeThis bikeDetails = new BikeThis("Royal Enfield", 23, 22f);
		bikeDetails.twoWheelers();
		
	}

}
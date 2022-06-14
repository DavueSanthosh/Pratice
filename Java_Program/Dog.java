package Java_Program;

public class Dog {
	String color = "white";
	String Breed = "pug";

	public void HouseDog() {
		System.out.println("color:" + color);
		System.out.println("Breed:" + Breed);
	}

	private void AreaDog() {
		System.out.println("pallu surya");
		
		
	}

	public static void main(String[] args) {

		Dog Pet = new Dog();
		Pet.HouseDog();
	}

}

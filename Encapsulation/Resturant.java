package Encapsulation;

public class Resturant {
	public String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void main(String[] args) {
		Resturant food = new Resturant();
		food.setName("Burger");
		System.out.println("the fav food:" + food.getName());
	}

}

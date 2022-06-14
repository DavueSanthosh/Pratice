package String_Method;

import Package.Food;

public class Resturant extends Food {
	
	public void Pizza() {
		System.out.println("Hey");
		
	}

	public static void main(String[] args) {
		
		Resturant water = new Resturant();
		water.eat();
		water.Pizza();

	}

}

package Training;

class Kfc 
{

	public void Cheese()
	{
		System.out.println("The Cheese Burger with Mojito");

	}

	public void meat()
	{
		System.out.println("The ME burger with French fries");

	}
}

public class FoodOverriding extends Kfc 
{

	@Override
	public void Cheese() {
		super.Cheese();
		
		System.out.println("Cheese Burger with Fried Chicken");
	}

	public static void main(String[] args) {
		
		FoodOverriding eat = new FoodOverriding();
		eat.Cheese();
		eat.meat();
	}

}

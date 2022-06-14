package Interface;

public class BreakfastInterface implements Breakfast {

	@Override
	public void noddles() {
		System.out.println("Chicken BBQ");
	}

	@Override
	public void Fried() {
		System.out.println("Garlic chicken");
	}

	public static void main(String[] args) {
		BreakfastInterface grand = new BreakfastInterface();
		grand.Fried();
		grand.noddles();

	}
}
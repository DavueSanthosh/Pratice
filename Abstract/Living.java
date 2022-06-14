package Abstract;

abstract class Human {

	public abstract void food();

	public abstract void dress();

}

public class Living extends Human {

	@Override
	public void food() {
		System.out.println("Cheese burger");
	}

	@Override
	public void dress() {
		System.out.println("Pizza");
	}

	public static void main(String[] args) {
		Living kfc = new Living();
		kfc.food();
		kfc.dress();
	}
}
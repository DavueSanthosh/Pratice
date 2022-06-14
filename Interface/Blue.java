package Interface;

interface Green {

	void jelly();
	void gel();
}

public class Blue implements Green {

	@Override
	public void jelly() {
		System.out.println("the color of jelly");
	}

	@Override
	public void gel() {
		System.out.println("the color of gel");

	}

	public static void main(String[] args) {
		Blue G1 = new Blue();
		G1.jelly();
		G1.gel();
	}
}
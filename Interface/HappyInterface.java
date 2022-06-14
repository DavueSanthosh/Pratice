package Interface;

interface Tony {

	void ironman();

	void pep();
}

public class HappyInterface implements Tony {

	@Override
	public void ironman() {
		System.out.println("i am IRONMAN");

	}

	@Override
	public void pep() {
		System.out.println("it's okay tony");

	}

	public static void main(String[] args) {
		HappyInterface stark = new HappyInterface();
		stark.ironman();
		stark.pep();
	}
}
package Interface;

interface Vidhya {

	void vidhya();

	void vidhyadetails();

}

public class Student implements Vidhya {
	String Name = "Wasted";

	@Override
	public void vidhya() {

		System.out.println("Vidhya is a Mad girl");

	}

	@Override
	public void vidhyadetails() {

		System.out.println("Vidhya from chidharam and" + Name);

	}

	public static void main(String[] args) {
		Student bad = new Student();
		bad.vidhya();
		bad.vidhyadetails();
	}

}
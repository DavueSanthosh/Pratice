package Training;

public class Countable {

	String name;
	int lower, upper, number;

	public Countable(String name, int lower, int upper, int number) {
		this.name = name;
		this.lower = lower;
		this.upper = upper;
		this.number = number;

	}

	public void checkTheLetters() {

		for (int Index = 0; Index < name.length(); Index++) {
			char check = name.charAt(Index);

			if (check >= 'a' && check <= 'z')
				lower++;
			else if (check >= 'A' && check <= 'Z')
				upper++;

			else if (check >= '1' && check <= '9')
				number++;

		}
		System.out.println("Total upper case is:" + upper);
		System.out.println("Total lower case is:" + lower);
		System.out.println("Total number  is:" + number);
	}

	public static void main(String[] args) {

		Countable letterCount = new Countable("HgFHBKJjrjntkj 748 00", 0, 0, 0);
		letterCount.checkTheLetters();
	}
}

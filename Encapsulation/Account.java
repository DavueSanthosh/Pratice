package Encapsulation;

public class Account {

	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Account details = new Account();
		details.getName();
	}
}

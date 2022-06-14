package Java_Program;

  public class Bird {
	 String name = "Sparrow";
	 String habit = "Flying";
	 int speed = 200;

	public void sky() {

		System.out.println("Name:" + name);
		System.out.println("Habit:" + habit);
		System.out.println("Speed:" + speed);
	}

	public static void main(String[] args) {
		Bird nest = new Bird();
		nest.sky();
	}

}

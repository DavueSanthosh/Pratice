package Constructor;

public class HabitConstructor {
	
   	public HabitConstructor(String name) {
		 System.out.println("the good habit is" + name);
		
	}

	public HabitConstructor(int num) {
		System.out.println("the good number is" + num);
	}

	public static void main(String[] args) {
		
		HabitConstructor dailyHabits = new HabitConstructor("washing");
		HabitConstructor luckyNumber = new HabitConstructor(3);
	}
}

package Polymorphism;

class Cricket {
	
	public void india() {
		String name = "MSD";
		System.out.println("Wicket keeper:" + name);
	}

	public void pak() {
		String captain = "Babar";
		System.out.println("Batsman:" + captain);
	}

	public void Nz() {
		String Blackcaps = "williamson";
		System.out.println("captain:" + Blackcaps);
	}
}

public class CricketOverriding extends Cricket {
	
	@Override
	public void india() {
		super.india();
		String name1 = "Virat Kohil";
		System.out.println("Batsman:" + name1);
	}

	public static void main(String[] args) {
		
		CricketOverriding match = new CricketOverriding();
		match.india();
		match.pak();
		match.Nz();
	}
}

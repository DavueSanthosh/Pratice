package Constructor;

public class Avengers {
	String name, team;
	int TeamSize;

	public Avengers(String name, String team, int TeamSize) {
		
		this.name = name;
		this.team = team;
		this.TeamSize = TeamSize;
		
		System.out.println(name + ":Captain america");
		System.out.println(team + ":marvel");
		System.out.println(TeamSize + ":Members");
	}

	public static void main(String[] args) {
		Avengers marvel = new Avengers("Avengers Captain", "Comics", 9);

	}
}

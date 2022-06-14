package Java_Program;


public class Employeerole {
	String role = "Tetser";
	
	public void Dept() {
		System.out.println("Employee Role:" + role);
		
	}

	String organisation = "Amazon";
	
	public void company() {
		System.out.println("Company name:" + organisation);
		
	}

    public static void main(String[] args) {
	   Employeerole student = new Employeerole();
		       student.Dept();
		       student.company();
	}
}

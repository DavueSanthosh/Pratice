package Java_Program;

public class Fan {
	String name = "Venus";
	int speed = 200;
	int wings = 4;

	public void Tablefan() {
		
		System.out.println("Fan name:" + name);
		System.out.println("Fan speed:" + speed);
		System.out.println("Fan wings:" + wings);
	}

	public static void main(String[] args) {
		Fan homefan = new Fan();
		homefan.Tablefan();
	}
}

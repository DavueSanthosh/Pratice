package Java_Program;

public class Employee {
	int id = 987;
	String name = "San";
	Float height = 5.5f;

	public void refer() {
		System.out.println("Employee id:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Employee height:" + height);
	}

	public static void main(String[] args) {
		Employee company = new Employee();
		company.refer();
	}
}

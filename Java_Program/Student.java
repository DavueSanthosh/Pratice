package Java_Program;

public class Student {
	String name = "Santhosh";
	int id = 2013;
	String dept = "ICE";

	public void Engineering() {
		System.out.println("Student name:" + name);
		System.out.println("Student id:" + id);
		System.out.println("Student dept:" + dept);
	}

	public static void main(String[] args) {
		Student boy = new Student();
		boy.Engineering();
	}

}

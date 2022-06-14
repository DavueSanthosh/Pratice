package Constructor;

public class StudentConstructor {
	int Id;
	String Name;
	char Dept;
	
	public StudentConstructor(int Id,String Name,char Dept) {
       this.Id=Id;
       this.Name=Name;
       this.Dept=Dept;

	}
       public void College() {
      System.out.println("The college Id card:" + Id);
      System.out.println("The name of the student:" + Name);
      System.out.println("The Dept of the student:" + Dept);
	}


	public static void main(String[] args) {
		
		StudentConstructor Engineering = new StudentConstructor(1123, "Santhosh",'B');
		Engineering.College();
	}
}

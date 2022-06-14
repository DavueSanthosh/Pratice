package Constructor;

public class EmployeeConstructor {
	String name,role;
	int Id;
	
	public EmployeeConstructor(String name, String role,int Id) {
	  this.name=name;
	  this.Id=Id;
	  this.role=role;
	}
	
	public void employer() {
		
         System.out.println("Employee name:"+" "+ name);
         System.out.println("Employee role:"+" "+ role);
         System.out.println("Employee Id:"+" "+ Id);
	}
}

	
package Package;

import Java_Program.Employeerole;

public class CallPackage {
	  void pack() {
		System.out.println("aaaa");
	}

	public static void main(String[] args) {
		
		CallPackage samePackage = new CallPackage();
		samePackage.pack();
		
		Employee differentPackage = new Employee();
		differentPackage.employeeDetails();
		differentPackage.employeeDetails2();
		
		Employeerole differentPackage2 = new Employeerole();
		differentPackage2.Dept();
		differentPackage2.company();

	}

}

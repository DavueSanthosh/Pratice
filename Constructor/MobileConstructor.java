package Constructor;

public class MobileConstructor {
	
	String name;
	int number;
	String Model;

	
	public MobileConstructor(String name,int number,String Model) {
		this.name=name;
		this.number=number;
		this.Model=Model;
	}
	
	 void Phone() {
        System.out.println("Name of the Mobile:"+" "+name);
        System.out.println("Model of the Mobile:"+" "+Model);
        System.out.println("Number of the Mobile:"+" "+number);
	}

	public static void main(String[] args) {
		
	MobileConstructor Mobilephone = new MobileConstructor("One Plus",11, "5T");
	Mobilephone.Phone();
	}

}

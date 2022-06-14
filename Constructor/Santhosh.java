package Constructor;

public class  Santhosh {
	
	public Santhosh(int age,double Height) {
		
		System.out.println("Santhosh Age:" + age);
		System.out.println("Santhosh Height:"+ Height);

	}
    public Santhosh(String color) {
	
	System.out.println("Santhosh Identify:"+color);
	
}
	public static void main(String[] args) {
		
		Santhosh details=new Santhosh(23,5.4);
		Santhosh height=new Santhosh("Medium");
	}

}

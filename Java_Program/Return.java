package Java_Program;

public class Return {

	int number1=10;
	int number2=20;
	int add;
	
	public int sum()
	{
		add=number1+number2;
         return add;
	}
	
	public static void main(String[] args) {
		Return maths=new Return();
		maths.sum();
		System.out.println("Add is:"+maths.sum());
		
		
	}

}

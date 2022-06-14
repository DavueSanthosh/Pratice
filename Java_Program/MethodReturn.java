package Java_Program;

public class MethodReturn
{
	int number1=10;
	int number2=20;
	String food; 
	String food2; 
	
   public String sum() 
   {
	   food="Burger is 200";
	//System.out.println("The Burger"+food);   
	return food;

  }
	public String add() 
	{
            food2="Pizza is 600";
      //      System.out.println(food2);
            return food2;
	}
	
	public static void main(String[] args)
	{
		MethodReturn eat=new MethodReturn();
		 eat.add();
		eat.sum();
		System.out.println(eat.add());
		System.out.println(eat.sum());
		
		
	}

}

package Execrise;


	class Constructor{
		
	public	Constructor(String name)
	{
			System.out.println(name);
		}
	
		void method()
		{
			System.out.println("method ");
		}
		
		
	}
	public class Difference
	{

		public static void main(String[] args) {
		Constructor obj=new Constructor("Food");
		obj.method();

		}

	}



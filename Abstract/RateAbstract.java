package Abstract;

 abstract class Food {
	 
      abstract void eat();
      abstract void snacks(); 
        
		}

   public class RateAbstract extends Food 
   {	
	@Override
	public void eat() 
	{
		System.out.println("KFC");
	
	}

	@Override
	public void snacks() 
	{
		System.out.println("Meat and eat");
	} 
	
    public static void main(String[] args) {
       RateAbstract ibaco = new RateAbstract();
    	ibaco.eat();
    	ibaco.snacks();
    	
    }
  }
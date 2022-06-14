package Abstract;

 abstract class GreenColorAbstract {
	 
      abstract void blue();
      abstract void yellow();
      
      }
public class GreenAbstract extends GreenColorAbstract{

	@Override
	void blue() {
     System.out.println("the sky blue");		
	}

	@Override
	void yellow() {
   System.out.println("the yellow is feeling");		
	}
	
	public static void main(String[] args) {
		GreenAbstract color=new GreenAbstract();
		color.blue();
		color.yellow();
	}

}
	

	
	
	



















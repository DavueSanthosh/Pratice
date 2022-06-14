package List;

import java.util.ArrayList;
import java.util.List;

public class ContainsList {

	public static void main(String[] args) {
		
		 List livingRoutine = new ArrayList();
		 
		 livingRoutine.add("be happy");
		 livingRoutine.add("eat well");
		 livingRoutine.add("live peace");
	       boolean check = livingRoutine.contains("j");
	       
	       if(check)
	    	   System.out.println("the eat well is contain");
	       
	       else
	    	   System.out.println("the eat well is  not contain");
	       
	}

}

package List;

import java.util.ArrayList;
import java.util.List;

public class MethodList {

	public static void main(String[] args) {
    List Name = new ArrayList();
     Name.add("food");
     Name.add("Burger");
     Name.add("Fried chicken");
     System.out.println(Name);
     List name2=new ArrayList();
     name2.add("food");
     name2.add("Burger");
     name2.add("Fried chicken");
     name2.add("BBQ");
     name2.add("Grill Chicken");
     name2.addAll(Name);
    System.out.println(name2);
    name2.retainAll(Name);
   //  name2.removeAll(Name);
     System.out.println(name2);
	}

}
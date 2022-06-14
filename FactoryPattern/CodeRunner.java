package FactoryPattern;

public class CodeRunner {

	public static void main(String[] args) {

		DesignPattern mobile = new DesignPattern();
		mobile.getInstance("OnePlus");
		
		Phone cell=	mobile.getInstance("OnePlus");//Dynamic Binding
		cell.mobilePhone();

	}

}

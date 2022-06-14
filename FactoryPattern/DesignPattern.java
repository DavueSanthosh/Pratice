package FactoryPattern;

public class DesignPattern {

	Phone getInstance(String PhoneName) {

		
		if (PhoneName.equals("OnePlus"))

			return new OnePlus();
		

		else if (PhoneName.equals("Iphone"))

			return new Iphone();

		else

			return new Redmi();

	}

}

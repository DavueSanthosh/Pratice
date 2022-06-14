package Inheritance;

class Burger {
	
	public void snacks() {
		String nam = "Chicken";
		System.out.println("Food name:" + nam);
	}
}

class Pizza extends Burger {
	
	public void white() {
		int a = 5;
		System.out.println("juice:" + a);
	}
}

class Pasta extends Pizza {
	
	public void white() {
		System.out.println("white pasta");

	}
}

class MultiLevelInheritance {
	
	public static void main(String[] args) {
		Pasta M1 = new Pasta();
		M1.white();
		M1.snacks();

	}
}

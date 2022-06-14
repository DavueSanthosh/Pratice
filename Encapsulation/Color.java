package Encapsulation;

public class Color {
	
	public String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Color red=new Color();
		red.setName("Santhosh");
		System.out.println("Man of the mass:"+red.getName());

	}

}

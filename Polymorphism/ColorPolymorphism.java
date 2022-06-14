package Polymorphism;

public class ColorPolymorphism 
{

	public void blue(String name) {
		System.out.println("the name is:" + name);

	}

	public void blue(String name, int num) {
		System.out.println("the  num is:" + num);

	}

	public static void main(String[] args) {

		ColorPolymorphism color = new ColorPolymorphism();
		color.blue("Captain america");
		color.blue("Ironman", 3000);
	}

}

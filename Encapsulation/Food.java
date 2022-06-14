package Encapsulation;

public class Food {
	private String Name;
	private String Actor;
	private String Dir;
	private int num;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String actor) {
		Actor = actor;
	}

	public String getDir() {
		return Dir;
	}

	public void setDir(String dir) {
		Dir = dir;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		
		Food red=new Food();
		red.setActor("MS dhoni");
		red.setName("Sushant singh rajput");
		red.setDir("Martin");
		red.setNum(5);
		
		System.out.println("the food name is:" +red.getName());
		System.out.println("the food name is:" +red.getActor());
		System.out.println("the food name is:" +red.getDir());
		System.out.println("the food name is:" +red.getNum());
		

	}

}

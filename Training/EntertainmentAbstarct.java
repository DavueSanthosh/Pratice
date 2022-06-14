package Training;

abstract class Game 
{

	abstract void cricket();
	abstract void shuttle();

}

public class EntertainmentAbstarct extends Game 
{

	@Override
	void cricket() 
	{
		System.out.println("The cricket Wonderful game");

	}

	@Override
	void shuttle() 
	{
		System.out.println("Shuttle i a Indoor game");

	}

	public static void main(String[] args) 
	{

		EntertainmentAbstarct playing = new EntertainmentAbstarct();
		playing.cricket();
		playing.shuttle();

	}
}
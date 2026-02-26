package inheritence;

public class Vehicle {
	void speed()
	{
		System.out.println("Current vehicle speed 60kmph");
	}
	void speed(int maxspeed) {
		System.out.println("Max vehicle speed "+maxspeed+"kmph");
	}
}
class car extends Vehicle
{
	static void speed(String mode) {
		System.out.println("Driving mode:"+mode);
	}
	public static void main(String args[])
	{
		car c=new car();
		c.speed();
		c.speed(100);
		c.speed("Eco");
	}
}

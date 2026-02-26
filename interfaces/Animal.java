package interfaces;

public interface Animal {
	/*
	 * Interface methods are completely abstract and cannot have a body 
	 * they are implemented in the respective child classes 
	 * therefore interfaces explicit 100% abstraction
	 */
	void sound();
	void run();
}
class cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Meow ");
	}
	@Override
	public void run()

	{
		System.out.println("Cat runs fast");
	}
	
}
class dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks ");
	}
	@Override
	public void run()

	{
		System.out.println("Dog runs fast");
	}
	
}
class demo{
	public static void main(String[] args) {
		cat c=new cat();
		c.sound();
		c.run();
		dog d=new dog();
		d.sound();
		d.run();
	}
}

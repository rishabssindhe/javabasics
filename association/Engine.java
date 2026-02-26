package association;

public class Engine {
	void start() {
		System.out.println("Engine starts");
	}
}
class car{
	private Engine engine;
	car(){
		//Engine class object is created here 
		engine=new Engine();
	}
	void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
	public static void main(String[] args) {
		car c=new car();
		c.drive();
	}
}

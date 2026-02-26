package finaldem;

public class Example2 {
	//if you dont initialize final variable where do you initialize it
	// answer is constructor
	final int x;
	//if you dont initialize static final variable where do you initialize it
		//
	static final int y;
	Example2(){
		x=20;
	}
	static {
		y=25;
		System.out.println("hello world");
	}
}

package inheritence;

public class Animal {
	void print1() {
		System.out.println("Sound");
	}
}
class dog extends Animal
{
	void dogsound() {
		System.out.println("Dog barks");
	}
}
class cat extends Animal
{
	void catsound() {
		System.out.println("Meow");
	}
	public static void main(String args[]) {
		cat c=new cat();
		dog d=new dog();
		c.print1();
		c.catsound();
		d.print1();
		d.dogsound();
	}
}

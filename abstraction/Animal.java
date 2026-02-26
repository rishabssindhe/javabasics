package abstraction;

abstract class Animal {
	//Normal or concrete methods
	//Abstract methods
	void eat() {
		System.out.println("Animal eat some food");
	}
	//the below method cannot have a body
	//it will be implemented in child classes
	abstract void run();
	//if an abstract class has only abstract methods
	// it is 100% abstraction
	// if it has even 1 normal method then it is not 100%
	
}
class cat extends Animal{
	@Override 
	void run() {
		System.out.println("Cats run fast....");
	}
}
class cheetah extends Animal {
	@Override 
	void run() {
		System.out.println("Cheetahs run very fast....");
	}
}
class demo{
	public static void main(String args[]) {
		cat c=new cat();
		c.run();
		c.eat();
		cheetah ch=new cheetah();
		ch.run();
		ch.eat();
	}
}
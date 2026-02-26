package interfaces;

interface Sports {
	void play();
}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
class student extends Person implements Sports {
	student(String name){
		super(name);
	}
	@Override
	public void play() {
		System.out.println(name+" plays Cricket");
	}
}
class demo2{
	public static void main(String[] args) {
		student s=new student("Rishab");
		s.play();
	}
}

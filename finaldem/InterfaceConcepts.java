package finaldem;

public interface InterfaceConcepts {
	void display();
}
class a{
	
}
class b{
	
}
class Demo1{
public static void main(String[] args) {
	InterfaceConcepts obj=new InterfaceConcepts() {
		public void display()
		{
			System.out.println("Hello");
		}
	};
	obj.display();
	InterfaceConcepts obj1=() -> System.out.println("Hello WOrld");
	obj1.display();
}
}
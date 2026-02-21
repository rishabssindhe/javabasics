package inheritence;

public class parent {
	int x=10;
	void print() {
		System.out.println("Parent class:");
	}
}
class child extends parent
{
	int x=20;
	void show() {
		super.print();
		System.out.println(x);
		System.out.println(super.x);
	}
	public static void main(String args[])
	{
		child c=new child();
		c.show();
	}
}

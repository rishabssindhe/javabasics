package inheritence;

public class parents {
	parents(){
		System.out.println("Parent");
	}

}
class child1 extends parents
{
	child1()
	{
		super();
		System.out.println("Child");
	}
	public static void main(String args[])
	{
		child1 c=new child1();
	}
}

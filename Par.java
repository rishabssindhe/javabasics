package inheritence;

public class Par {
	void show()
	{
		System.out.println("This is parent class");	}

}
class Chi extends Par
{
	void show()
	{
		System.out.println("This is child class");
	}
	public static void main(String args[])
	{
		Par p=new Chi();
		p.show();
	}
}

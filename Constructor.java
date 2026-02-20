package iot;

public class Constructor {
	String name;
	int age;
	Constructor(String n,int a)
	{
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println("Name is "+name+"\nAge is "+age);
	}
	public static void main(String args[])
	{
		Constructor ct=new Constructor("Rishab",20);
		ct.display();
		ct.name="Rishab S Sindhe";
		ct.age=21;
		ct.display();
	}

}

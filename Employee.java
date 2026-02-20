package iot;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Employee name: "+name+"\nEmployee id:"+id+"\nSalary:"+salary+"\n");
	}
	public static void main(String[] args) {
		Employee e=new Employee(10,"Tejas MG",50000);
	}
}
package finaldem;

public class GCDemo {
	public static void main(String[] args) {
		GCDemo obj=new GCDemo();
		obj=null;
		System.gc();
		// Now a days the gc() method is automatically invoked 
		//after program execution by the object class 
		//for clutter , garbage collection and removal by the JVM
		// we do not need to call it explicitly
	}	
}

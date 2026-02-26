package finaldem;

public final class Demo {
	
}
/*class a extends Demo{ cannot inherit 
	
}
*/
class b {
	final void college() {
		System.out.println("SNPSU");
	}
}
class c extends b {
	// void college(); cannot override
	final int x=20;
	void show(final int x) {
		//x=25; cannot change value 
	}
}
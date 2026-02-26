package strings;

public class Builderexample {
	public void StringInsert() {
		StringBuilder buffer=new StringBuilder("He");
		System.out.println("Old Buffer"+buffer);
		buffer.insert(1, "AV");
		System.out.println("New Buffer"+buffer);
	}
	public void StringAppend() {
		StringBuilder buffer=new StringBuilder("SNPSU");
		System.out.println("Old Buffer"+buffer);
		buffer.append(" ISE ");
		System.out.println("New Buffer"+buffer);
	}
	public void StringReverse() {
		StringBuilder buffer=new StringBuilder("ISE");
		System.out.println("Old Buffer"+buffer);
		buffer.reverse();
		System.out.println("New Buffer"+buffer);
	}
	public static void main(String[] args) {
		new Builderexample().StringInsert();
		new Builderexample().StringAppend();
		new Builderexample().StringReverse();
	}
}


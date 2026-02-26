package strings;

public class Bufferexample {
	public void StringInsert() {
		StringBuffer buffer=new StringBuffer("He");
		System.out.println("Old Buffer"+buffer);
		buffer.insert(1, "AV");
		System.out.println("New Buffer"+buffer);
	}
	public void StringAppend() {
		StringBuffer buffer=new StringBuffer("SNPSU");
		System.out.println("Old Buffer"+buffer);
		buffer.append(" ISE ");
		System.out.println("New Buffer"+buffer);
	}
	public void StringReverse() {
		StringBuffer buffer=new StringBuffer("ISE");
		System.out.println("Old Buffer"+buffer);
		buffer.reverse();
		System.out.println("New Buffer"+buffer);
	}
	public static void main(String[] args) {
		new Bufferexample().StringInsert();
		new Bufferexample().StringAppend();
		new Bufferexample().StringReverse();
	}
}

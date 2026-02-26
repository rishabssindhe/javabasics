package finaldem;

public class GCExample {
	public static void main(String[] args) {
		String s1=new String("JAVA");
		String s2=new String("PYTHON");
		s1=s2;
		System.gc();
		System.out.println(s1);
	}
}

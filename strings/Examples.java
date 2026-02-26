package strings;
//Strings are immutable
//Concat 
public class Examples {
	public static void main(String[] args) {
		String s="Java";
		s=s+" Programming";
		String a=s.concat(" Programming");
		System.out.println(s);
	}
//String is immutable
	//scp string constant pool
	//Every modification creates a new object
	//good for read only data
}

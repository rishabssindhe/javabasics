package strings;

public class stringexample {
	public static void main(String[] args) {
		char[] letters= {'R','i','s','h','a','b'};
		String name=new String(letters);
		System.out.println(name);
		String jumbled="Rishabisfromiseb";
		String[] words=jumbled.split("i");
		System.out.println(words);
		for(Object o: words) {
			System.out.println(o+" ");
		}
		System.out.println();
	
	}

}

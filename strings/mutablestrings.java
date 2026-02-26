package strings;

public class mutablestrings {
	public static void main(String[] args) {
		String s="SNPSU";
		StringBuffer sb=new StringBuffer("SNPSU");
		//mutable but it is thread safe
		sb.append("ISE");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("SNPSU ");
		sb1.append("ISE");
		System.out.println(sb1);
	}
}

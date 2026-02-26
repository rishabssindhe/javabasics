package strings;

public class BuifferBuilderPerformance {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer("JAVA");
		for(int i=0;i<100000000;i++)
		{
			buffer.append(" DSA");
		}
		System.out.println("Buffer time: "+ (System.currentTimeMillis()-startTime)+" ms");
		StringBuilder builder=new StringBuilder();
		startTime=System.currentTimeMillis();
		for(int i=0;i<100000000;i++)
		{
			builder.append(" DSA");
		}
		System.out.println("Builder time: "+ (System.currentTimeMillis()-startTime)+" ms");
		
	}
}

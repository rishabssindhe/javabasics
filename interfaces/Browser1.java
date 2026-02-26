package interfaces;

public interface Browser1 {
	void browser1();
}
interface Browser2{
	void browser2();
}
interface Browser3{
	void browser3();
}
class browsers implements Browser1,Browser2,Browser3{
	@Override
	public void browser1() {
		System.out.println("Chrome");
	}
	@Override
	public void browser2() {
		System.out.println("Brave");
	}
	@Override
	public void browser3() {
		System.out.println("Edge");
	}
}
class demos{
	public static void main(String[] args) {
		browsers c=new browsers();
		c.browser1();
		c.browser2();
		c.browser3();
		
	}
}
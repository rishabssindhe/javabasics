package manualoverride;

public interface Cat {
	default void sound() {
		System.out.println("Meow");
	}
}
interface dog{
	default void sound() {
		System.out.println("Wolf!");
	}
}
class Cog implements Cat,dog {
	@Override
	public void sound() {
	dog.super.sound();
}
}
class demo{
	public static void main(String[] args) {
		Cog c=new Cog();
		c.sound();
	}
}
